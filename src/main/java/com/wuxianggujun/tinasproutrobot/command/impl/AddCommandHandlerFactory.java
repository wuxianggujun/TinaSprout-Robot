package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.factory.CommandHandlerFactory;
import com.wuxianggujun.tinasproutrobot.command.intface.CommandHandler;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:40
 **/
public class AddCommandHandlerFactory implements CommandHandlerFactory {

    @Override
    public CommandHandler createHandler(String option) {
        if ("-admin".equals(option)) {
            return new AddAdminCommandHandler();
        } else {
            throw new IllegalArgumentException("Unknown option: " + option);
        }
    }


}
