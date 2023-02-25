package com.wuxianggujun.tinasproutrobot;

import com.wuxianggujun.tinasproutrobot.utils.SnowflakeIdUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TinaSproutRobotApplicationTests {

    @Autowired
    private SnowflakeIdUtil snowflakeIdUtil;

    @Test
    void contextLoads() {
        System.out.println("snowflakeIdUtil.getStringId() = " + snowflakeIdUtil.getStringId());

    }

}
