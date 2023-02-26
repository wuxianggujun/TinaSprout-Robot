package com.wuxianggujun.tinasproutrobot.command.inter;

import com.wuxianggujun.tinasproutrobot.command.CommandArgs;

import java.util.Map;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 22:54
 * 通用命令接口，包含一个执行方法,可选是否使用args来解析params
 **/
public interface Command {
    void execute(CommandArgs args);
}
