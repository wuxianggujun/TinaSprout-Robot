package com.wuxianggujun.tinasproutrobot.command.intface;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 16:33
 **/
public interface Command {
    void execute(String content);

    String getOption();
}
