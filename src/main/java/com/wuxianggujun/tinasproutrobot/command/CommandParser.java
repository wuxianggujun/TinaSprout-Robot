package com.wuxianggujun.tinasproutrobot.command;

import com.wuxianggujun.tinasproutrobot.command.impl.AddCommandFactory;
import com.wuxianggujun.tinasproutrobot.command.inter.Command;
import com.wuxianggujun.tinasproutrobot.command.inter.CommandFactory;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 23:03
 **/
public class CommandParser {
    private CommandFactory commandFactory;
    private String operator = "/";

    public CommandParser() {

    }

    public CommandParser(CommandFactory commandFactory) {
        this.commandFactory = commandFactory;
    }


    public void parse(@NotNull String commandLine) {
        if (!commandLine.startsWith(operator)) {
            return;
        }
        String[] args = commandLine.split("\\s+");
        String commandName = args[0].substring(args[0].indexOf(operator) + 1);
        //减去/add的数组，复制一份
        String[] commandArray = Arrays.copyOfRange(args, 1, args.length);
        Map<String, String> params = parseCommandArgs(commandArray);
        CommandArgs commandArgs = new CommandArgs(params);
        if (commandFactory == null) {
            commandFactory = createCommandFactory(commandName);
            if (commandFactory == null) {
                return;
                //throw new IllegalArgumentException("The command does not exist " + commandName);
            }
        }

        Command command = commandFactory.createCommand(commandArgs);
        if (command != null) {
            command.execute(commandArgs);
        }
    }

    public Map<String, String> parseCommandArgs(@NotNull String[] args) {
        Map<String, String> argMap = new HashMap<>();
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


   /* public Map<String, String> parseCommandArgs(String[] args) {
        Map<String, String> result = new HashMap<>();

        for (int i = 1; i < args.length; i++) {
            String arg = args[i];
            if (arg.startsWith("-")) {
                int index = arg.indexOf("=");
                if (index > 0) {
                    String key = arg.substring(1, index);
                    String value = arg.substring(index + 1).trim();
                    result.put(key, value);
                } else if (i + 1 < args.length && !args[i + 1].startsWith("-")) {
                    String key = arg.substring(1);
                    String value = args[i + 1].trim();
                    result.put(key, value);
                    i++;
                } else {
                    String key = arg.substring(1);
                    result.put(key, "");
                }
            }
        }

        return result;
    }*/

    private CommandFactory createCommandFactory(String commandName) {
        CommandFactory commandFactory = null;
        switch (commandName) {
            case "add":
                commandFactory = new AddCommandFactory();
                break;
        }
        return commandFactory;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
