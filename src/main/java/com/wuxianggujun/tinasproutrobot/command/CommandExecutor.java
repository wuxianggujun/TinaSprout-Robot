package com.wuxianggujun.tinasproutrobot.command;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 17:44
 **/
public class CommandExecutor {
    public void execute(Command command){
        if (command!=null){
            command.execute();
        }
    }
}
