package com.wuxianggujun.tinasproutrobot.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tina_sprout_frineds")
public class TinaSprout_Frineds {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}