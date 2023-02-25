package com.wuxianggujun.tinasproutrobot.command;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 17:41
 **/
public class TinaSproutCommand implements Command {

    private CommandParse commandParse;

    public TinaSproutCommand(String message) {
        commandParse = new CommandParse(message);
    }

    @Override
    public void execute() {
        System.out.println("commandParse.getOperator() = " + commandParse.getOperator());
        System.out.println("commandParse.getAction() = " + commandParse.getAction());
        System.out.println("commandParse.getParams() = " + commandParse.getParams());
    }
}
