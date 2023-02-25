package com.wuxianggujun.tinasproutrobot.command.factory;

import com.wuxianggujun.tinasproutrobot.command.intface.Command;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:10
 * 使用工厂模式来创建
 **/
public interface CommandFactory {
    Command createCommand(String option, String content);

    CommandHandlerFactory getHandlerFactory();
}
