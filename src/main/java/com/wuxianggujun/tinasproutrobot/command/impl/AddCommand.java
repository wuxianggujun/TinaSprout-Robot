package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.intface.Command;
import com.wuxianggujun.tinasproutrobot.command.intface.CommandHandler;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:08
 **/
public class AddCommand implements Command {
    private final String option;
    private final CommandHandler commandHandler;

    public AddCommand(CommandHandler commandHandler, String option) {
        this.commandHandler = commandHandler;
        this.option = option;
    }

    @Override
    public void execute(String content) {
        System.out.println("Adding content: " + content);
    }

    @Override
    public String getOption() {
        return option;
    }
}
