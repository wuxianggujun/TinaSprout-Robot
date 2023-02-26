package com.wuxianggujun.tinasproutrobot.command;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 23:07
 **/
public class CommandLineTest {
    public static void main(String[] args) {
        CommandParser commandParser = new CommandParser();
        commandParser.parse("/add -admin wuxianggujun -input i love you");
    }
}
