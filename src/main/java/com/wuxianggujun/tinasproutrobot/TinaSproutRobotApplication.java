package com.wuxianggujun.tinasproutrobot;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitScan;
import com.zhuangxv.bot.EnableBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBot
@RetrofitScan("com.github.lianjiatech.retrofit.spring.boot.test")
@SpringBootApplication(scanBasePackages = {"com.wuxianggujun.tinasproutrobot.*","cn.hutool.extra.spring"})
public class TinaSproutRobotApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinaSproutRobotApplication.class, args);
    }

}
