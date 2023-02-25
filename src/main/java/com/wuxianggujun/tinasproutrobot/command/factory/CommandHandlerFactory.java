package com.wuxianggujun.tinasproutrobot.command.factory;

import com.wuxianggujun.tinasproutrobot.command.intface.CommandHandler;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:36
 **/
public interface CommandHandlerFactory {
    CommandHandler createHandler(String command);
}
