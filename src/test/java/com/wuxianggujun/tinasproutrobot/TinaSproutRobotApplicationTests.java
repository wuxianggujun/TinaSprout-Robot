package com.wuxianggujun.tinasproutrobot;

import com.wuxianggujun.tinasproutrobot.controller.UserController;
import com.wuxianggujun.tinasproutrobot.core.SaveChatHistory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TinaSproutRobotApplicationTests {

    @Autowired
    private SaveChatHistory userController;

    @Test
    void contextLoads() {


    }

}
