package com.wuxianggujun.tinasproutrobot.core;

import com.wuxianggujun.tinasproutrobot.command.CommandParser;
import com.zhuangxv.bot.annotation.FriendMessageHandler;
import com.zhuangxv.bot.core.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author WuXiangGuJun
 * @create 2023-02-26 15:29
 **/
@Component
public class TinaSproutCommand {

    private CommandParser commandParser;

    @Autowired
    public void setCommandParser(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    @FriendMessageHandler(senderIds = {})
    public void message(Friend friend, String message) {
        commandParser.setContact(friend);
        commandParser.parse(message);
    }


}
