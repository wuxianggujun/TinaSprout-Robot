package com.wuxianggujun.tinasproutrobot.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author WuXiangGuJun
 * @create 2022-12-22 11:25
 **/
@Data
@Entity
public class TinaSprout_Bots {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
}
