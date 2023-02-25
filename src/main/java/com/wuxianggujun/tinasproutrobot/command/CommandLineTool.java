package com.wuxianggujun.tinasproutrobot.command;

import com.wuxianggujun.tinasproutrobot.command.factory.CommandFactory;
import com.wuxianggujun.tinasproutrobot.command.impl.AddCommandFactory;
import com.wuxianggujun.tinasproutrobot.command.intface.Command;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:12
 **/
public class CommandLineTool {
    public static void main(String[] args) {

    }

    private static CommandFactory createCommandFactory(String command) {
        return new AddCommandFactory();
    }
}
