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

    public CommandParser(CommandFactory commandFactory) {
        this.commandFactory = commandFactory;
    }

    public CommandParser() {

    }

    public void parse(@NotNull String commandLine) {

        String[] args = commandLine.split("\\s+");

        String commandName = args[0].substring(1);
        System.out.println("commandName = " + commandName);

        //减去/add的数组，复制一份
        String[] commandArgs = Arrays.copyOfRange(args, 1, args.length);

        Map<String, String> params = parseCommandArgs(commandArgs);
        System.out.println("params = " + params.get("admin"));
        System.out.println("params.get(\"input\") = " + params.get("input"));
        System.out.println("params = " + params.values());

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



    /*public void parse(@NotNull String inputString) {
        String[] commandParts = inputString.split("\\s+");
        //获取命令名字是add还是delete
        String commandName = commandParts[0].substring(1);
        CommandFactory commandFactory = createCommandFactory(commandName);
        //判断命令存不存在
        if (commandFactory == null) {
            throw new IllegalArgumentException("Unknown command: " + commandName);
        }
        Map<String, String> argsMap = new HashMap<>();
        for (int i = 1; i < commandParts.length; i += 2) {
            String arg = commandParts[i];
            if (arg.startsWith("-")) {
                String key = arg.substring(1);
                String value = "";
                if (i + 1 < commandParts.length && !commandParts[i + 1].startsWith("-")) {
                    value = commandParts[i + 1];
                    i++;
                }
                argsMap.put(key, value);
            }
        }
        CommandArgs commandArgs = new CommandArgs(argsMap);
        Command command = commandFactory.createCommand(commandArgs);
        if (command != null) {
            command.execute(commandArgs);
        }
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
}
