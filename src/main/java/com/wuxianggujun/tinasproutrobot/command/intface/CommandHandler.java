package com.wuxianggujun.tinasproutrobot.command.intface;

import com.wuxianggujun.tinasproutrobot.command.intface.Command;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 21:33
 * 处理特定类型的命令
 **/
public interface CommandHandler {
    boolean canHandle(String option);

    Command createCommand(String content);
}
