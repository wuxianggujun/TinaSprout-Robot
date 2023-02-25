package com.wuxianggujun.tinasproutrobot.command;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:20
 * 用来存储解析的实例类
 **/
public class ParsedCommand {
    private final String command;
    private final String option;

    public ParsedCommand(String command, String option) {
        this.command = command;
        this.option = option;
    }

    public String getCommand() {
        return command;
    }

    public String getOption() {
        return option;
    }

}
