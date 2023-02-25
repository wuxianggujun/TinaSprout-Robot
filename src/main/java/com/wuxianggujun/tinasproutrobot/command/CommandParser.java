package com.wuxianggujun.tinasproutrobot.command;

import java.util.Arrays;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 19:14
 **/
public class CommandParser {
    private String commandLine;
    private String operator = "/";

    public CommandParser() {

    }

    public CommandParser(String commandLine) {
        this.commandLine = commandLine;
        //只有操作符符合你定义的才开始解析
        if (commandLine.startsWith(operator)) {
            parse();
        } else {
            System.out.println("Invalid command format.");
        }
    }

    public void parse() {
        String[] parts = commandLine.split(" ");
        String command = parts[0].substring(operator.length());
        String[] args = new String[parts.length - 1];
        System.arraycopy(parts, 1, args, 0, args.length);
        processCommand(command, args);
    }


    public ParsedCommand parse(String commandStr) {
        if (!commandStr.startsWith(operator)) {
            return null;
        }
        String[] parts = commandStr.split("\\\\s+");
        String command = parts[0].substring(1);
        String option = parts.length > 1 ? parts[1] : "";
        return new ParsedCommand(command, option);
    }


    public void processCommand(String command, String[] args) {
        System.out.println("command = " + command);
        System.out.println("args = " + Arrays.toString(args));
    }
}
