package com.wuxianggujun.tinasproutrobot.command;

import com.wuxianggujun.tinasproutrobot.command.factory.CommandFactory;
import com.wuxianggujun.tinasproutrobot.command.factory.CommandHandlerFactory;
import com.wuxianggujun.tinasproutrobot.command.impl.AddCommandFactory;
import com.wuxianggujun.tinasproutrobot.command.intface.Command;
import com.wuxianggujun.tinasproutrobot.command.intface.CommandHandler;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:12
 **/
public class CommandLineTool {
    public static void main(String[] args) {
        String commandLine = "/add -admin wuxianggujun";
        CommandFactory commandFactory = createCommandFactory(commandLine);
        commandFactory.createCommand("-admin", "wuxianggujun");
        CommandHandlerFactory commandHandler = commandFactory.getHandlerFactory();


    }

    private static CommandFactory createCommandFactory(String command) {
        return new AddCommandFactory();
    }
}
