package com.wuxianggujun.tinasproutrobot.command.factory;

import com.wuxianggujun.tinasproutrobot.command.intface.Command;
import com.wuxianggujun.tinasproutrobot.command.intface.CommandHandler;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:36
 * <p>
 * CommandHandlerFactory是一个工厂类，
 * 它的作用是根据命令类型创建相应的命令处理器。在使用命令模式时，
 * 通常会将不同的命令封装成不同的命令对象，每个命令对象都有一个对应的命令处理器来执行具体的操作
 **/
public interface CommandHandlerFactory {
    CommandHandler createHandler(Command command);
}
