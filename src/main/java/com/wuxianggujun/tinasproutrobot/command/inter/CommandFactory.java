package com.wuxianggujun.tinasproutrobot.command.inter;

import com.wuxianggujun.tinasproutrobot.command.CommandArgs;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 22:56
 **/
public interface CommandFactory {
    Command createCommand(CommandArgs args);
}
