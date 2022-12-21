package com.wuxianggujun.tinasproutrobot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author WuXiangGuJun
 * @create 2022-12-21 16:52
 **/
@Entity
@Data
public class User {

    @Id
    private Long id;
    private String name;
    private int age;

    public User() {

    }

}
