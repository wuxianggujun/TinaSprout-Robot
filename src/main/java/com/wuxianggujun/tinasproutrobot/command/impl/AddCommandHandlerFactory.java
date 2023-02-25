package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.factory.CommandHandlerFactory;
import com.wuxianggujun.tinasproutrobot.command.intface.Command;
import com.wuxianggujun.tinasproutrobot.command.intface.CommandHandler;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:40
 * 相当于解析option的
 **/
public class AddCommandHandlerFactory implements CommandHandlerFactory {

    @Override
    public CommandHandler createHandler(Command command) {
        if (command instanceof AddCommand) {
            return new AddAdminCommandHandler();
        } else {
            throw new IllegalArgumentException("Unknown command: " + command.getClass().getName());
        }
    }


}
