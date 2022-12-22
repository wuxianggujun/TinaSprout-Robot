package com.wuxianggujun.tinasproutrobot;

import com.zhuangxv.bot.EnableBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableBot
@SpringBootApplication
// 扫描cn.hutool.extra.spring包下所有类并注册之
@ComponentScan(basePackages = {"cn.hutool.extra.spring"})
public class TinaSproutRobotApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinaSproutRobotApplication.class, args);
    }

}
