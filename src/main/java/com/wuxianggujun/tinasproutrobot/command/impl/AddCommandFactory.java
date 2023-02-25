package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.factory.CommandFactory;
import com.wuxianggujun.tinasproutrobot.command.factory.CommandHandlerFactory;
import com.wuxianggujun.tinasproutrobot.command.intface.Command;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:11
 **/
public class AddCommandFactory implements CommandFactory {

    @Override
    public Command createCommand(String option, String content) {
        CommandHandlerFactory factory = getHandlerFactory();
        return new AddCommand(handler, content);
    }

    @Override
    public CommandHandlerFactory getHandlerFactory() {
        return new AddCommandHandlerFactory();
    }
}
