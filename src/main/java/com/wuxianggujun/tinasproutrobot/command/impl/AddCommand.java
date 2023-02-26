package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.CommandArgs;
import com.wuxianggujun.tinasproutrobot.command.inter.Command;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 23:01
 **/
public class AddCommand implements Command {

    @Override
    public void execute(CommandArgs args) {
        System.out.println("AddCommand = " + this.getClass().getName());
    }
}
