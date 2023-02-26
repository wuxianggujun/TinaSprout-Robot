package com.wuxianggujun.tinasproutrobot.command;

import com.wuxianggujun.tinasproutrobot.command.impl.AddCommandFactory;
import com.wuxianggujun.tinasproutrobot.command.inter.Command;
import com.wuxianggujun.tinasproutrobot.command.inter.CommandFactory;

import java.util.HashMap;
import java.util.Map;

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

    public void parse(String inputString) {
        String[] parts = inputString.split(" ");
        //获取命令名字是add还是delete
        String commandName = parts[0].substring(1);
        CommandFactory commandFactory = createCommandFactory(commandName);
        //判断命令存不存在
        if (commandFactory == null) {
            throw new IllegalArgumentException("Unknown command: " + commandName);
        }
        Map<String, String> argsMap = new HashMap<>();
        for (int i = 1; i < parts.length; i += 2) {
            if (i + 1 >= parts.length) {
                throw new IllegalArgumentException("Invalid command line: " + inputString);
            }
            String key = parts[i].replaceAll("-", "");
            String value = parts[i + 1];
            argsMap.put(key, value);
        }
        CommandArgs commandArgs = new CommandArgs(argsMap);
        Command command = commandFactory.createCommand(commandArgs);
        if (command != null) {
            command.execute();
        }
    }

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
