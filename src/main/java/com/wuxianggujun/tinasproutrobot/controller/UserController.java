package com.wuxianggujun.tinasproutrobot.controller;

import com.wuxianggujun.tinasproutrobot.entity.User;
import com.wuxianggujun.tinasproutrobot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author WuXiangGuJun
 * @create 2022-12-21 16:56
 **/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void createUser() {
        User user = new User();
        user.setId(3344207732L);
        user.setName("无相孤君");
        user.setAge(21);
        userService.createUser(user);
    }

}
