package com.wuxianggujun.tinasproutrobot.core;

import com.zhuangxv.bot.annotation.FriendMessageHandler;
import com.zhuangxv.bot.annotation.GroupMessageHandler;
import com.zhuangxv.bot.core.Friend;
import com.zhuangxv.bot.core.Group;
import org.springframework.stereotype.Component;

@Component
public class Test {

    @FriendMessageHandler(senderIds = {})
    public void message(Friend friend,String message){
        System.out.println("friend = " + friend);
        System.out.println("message = " + message);
    }
}
