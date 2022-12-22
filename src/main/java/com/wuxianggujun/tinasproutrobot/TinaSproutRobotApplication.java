package com.wuxianggujun.tinasproutrobot;

import com.zhuangxv.bot.EnableBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableBot
@SpringBootApplication(scanBasePackages = {"com.wuxianggujun.tinasproutrobot.*","cn.hutool.extra.spring"})
public class TinaSproutRobotApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinaSproutRobotApplication.class, args);
    }

}
