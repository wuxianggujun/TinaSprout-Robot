package com.wuxianggujun.tinasproutrobot.core;

import cn.hutool.extra.spring.SpringUtil;
import com.zhuangxv.bot.annotation.FriendMessageHandler;
import com.zhuangxv.bot.annotation.GroupMessageHandler;
import com.zhuangxv.bot.core.Bot;
import com.zhuangxv.bot.core.Friend;
import com.zhuangxv.bot.core.Group;
import com.zhuangxv.bot.core.Member;
import com.zhuangxv.bot.core.component.BotFactory;
import com.zhuangxv.bot.injector.support.BotInjector;
import com.zhuangxv.bot.message.MessageChain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author WuXiangGuJun
 * @create 2022-12-22 9:44
 **/
@Component
@Slf4j
public class SaveChatHistory {


    public SaveChatHistory() {
        for (Bot bot : BotFactory.getBots().values()) {
            System.out.println("bot = " + bot.getBotName());
        }
    }


    @GroupMessageHandler(groupIds = {})
    public void saveGroupMessage(Group group, Member member, MessageChain messageChain, String message, Integer messageId) {

    }

    @FriendMessageHandler(senderIds = {})
    public void saveFriendMessage(Friend friend, MessageChain messageChain, String message, Integer messageId) {

    }

}
