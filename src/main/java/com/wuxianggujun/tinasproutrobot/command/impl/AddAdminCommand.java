package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.CommandArgs;
import com.wuxianggujun.tinasproutrobot.command.inter.Command;

import java.util.Arrays;

/**
 * @author WuXiangGuJun
 * @create 2023-02-26 11:47
 **/
public class AddAdminCommand implements Command {

    public AddAdminCommand() {

    }

    @Override
    public void execute(CommandArgs args) {
        System.out.println("args.getValue(\"input\") = " + args.getValue("input"));
        System.out.println("this.getClass().getName() = " + this.getClass().getName());
        System.out.println("args = " + args.toString());
    }
}
