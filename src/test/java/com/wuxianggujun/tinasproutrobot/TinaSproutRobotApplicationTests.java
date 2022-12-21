package com.wuxianggujun.tinasproutrobot;

import com.wuxianggujun.tinasproutrobot.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TinaSproutRobotApplicationTests {

    @Autowired
    private UserController userController;

    @Test
    void contextLoads() {
        userController.createUser();
    }

}
