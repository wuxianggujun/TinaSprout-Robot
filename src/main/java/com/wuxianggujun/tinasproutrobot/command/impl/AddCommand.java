package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.CommandArgs;
import com.wuxianggujun.tinasproutrobot.command.inter.Command;
import com.zhuangxv.bot.core.Friend;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 23:01
 **/
public class AddCommand implements Command {

    @Override
    public void execute(CommandArgs args) {

        System.out.println("args.getValue(\"input\") = " + args.getValue("input"));
        System.out.println("this.getClass().getName() = " + this.getClass().getName());
        System.out.println("args = " + args.toString());
    }
}
