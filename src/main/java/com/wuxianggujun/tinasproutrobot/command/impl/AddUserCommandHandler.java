package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.intface.Command;
import com.wuxianggujun.tinasproutrobot.command.intface.CommandHandler;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 22:26
 **/
public class AddUserCommandHandler implements CommandHandler {
    @Override
    public boolean canHandle(String option) {
        return false;
    }

    @Override
    public Command createCommand(String content) {
        return null;
    }

}
