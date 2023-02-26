package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.CommandArgs;
import com.wuxianggujun.tinasproutrobot.command.inter.Command;

/**
 * @author WuXiangGuJun
 * @create 2023-02-26 11:47
 **/
public class AddAdminCommand implements Command {
    @Override
    public void execute() {
        System.out.println("this.getClass().getName() = " + this.getClass().getName());
    }
}
