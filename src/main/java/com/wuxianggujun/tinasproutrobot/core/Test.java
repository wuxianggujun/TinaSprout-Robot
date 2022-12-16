package com.wuxianggujun.tinasproutrobot.core;

import com.zhuangxv.bot.annotation.GroupMessageHandler;
import com.zhuangxv.bot.core.Group;
import org.springframework.stereotype.Component;

@Component
public class Test {
    
    public Test(){
        System.out.println("我被初始化化");
    }
    
    @GroupMessageHandler
    public void message(Group group){
        System.out.println("group = " + group.getGroupName());
    }
}
