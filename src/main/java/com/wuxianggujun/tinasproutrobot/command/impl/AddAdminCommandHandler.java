package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.intface.Command;
import com.wuxianggujun.tinasproutrobot.command.intface.CommandHandler;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:44
 **/
public class AddAdminCommandHandler implements CommandHandler {
    @Override
    public boolean canHandle(String option) {
        return false;
    }

    @Override
    public Command createCommand(String content) {
        return null;
    }
}
