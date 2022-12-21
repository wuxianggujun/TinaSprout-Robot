package com.wuxianggujun.tinasproutrobot.service.impl;

import com.wuxianggujun.tinasproutrobot.entity.User;
import com.wuxianggujun.tinasproutrobot.repo.UserRepository;
import com.wuxianggujun.tinasproutrobot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WuXiangGuJun
 * @create 2022-12-21 16:59
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
}
