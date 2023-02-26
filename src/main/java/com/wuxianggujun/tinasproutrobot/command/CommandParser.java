package com.wuxianggujun.tinasproutrobot.command;

import com.wuxianggujun.tinasproutrobot.command.impl.AddCommandFactory;
import com.wuxianggujun.tinasproutrobot.command.inter.Command;
import com.wuxianggujun.tinasproutrobot.command.inter.CommandFactory;
import com.zhuangxv.bot.core.Contact;
import com.zhuangxv.bot.core.Friend;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 23:03
 **/
@Component
public class CommandParser {
    private String operator = "/";
    private Contact contact;

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public CommandParser() {
    }


    public void parse(@NotNull String commandLine) {
        if (!commandLine.startsWith(operator)) {
            return;
        }
        String[] args = commandLine.split("\\s+");
        String commandName = args[0].substring(args[0].indexOf(operator) + 1);
        //减去/add的数组，复制一份
        String[] commandArray = Arrays.copyOfRange(args, 1, args.length);
        Map<String, Object> params = parseCommandArgs(commandArray);
        CommandArgs commandArgs = new CommandArgs(params);
        if (contact != null) {
            if (contact instanceof Friend friend) {
                commandArgs.setValue(Friend.class.getName(), friend);
            }
        }
        CommandFactory commandFactory = createCommandFactory(commandName);
        if (commandFactory == null) return;
        Command command = commandFactory.createCommand(commandArgs);
        if (command != null) {
            command.execute(commandArgs);
        }
    }

    public Map<String, Object> parseCommandArgs(@NotNull String[] args) {
        Map<String, Object> argMap = new HashMap<>();
        String currentKey = "default";
        StringBuilder currentVal = null;
        for (String arg : args) {
            if (arg.startsWith("-")) {
                if (currentVal != null) {
                    argMap.put(currentKey, currentVal.toString());
                    currentVal = null;
                }
                currentKey = arg.substring(1);
            } else {
                if (currentVal == null) {
                    currentVal = new StringBuilder();
                } else {
                    currentVal.append(" ");
                }
                currentVal.append(arg);
            }
        }
        if (currentVal != null) {
            argMap.put(currentKey, currentVal.toString());
        }
        return argMap;
    }

    private CommandFactory createCommandFactory(String commandName) {
        CommandFactory commandFactory = null;
        if (commandName.equals("add")) {
            commandFactory = new AddCommandFactory();
        }
        return commandFactory;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
