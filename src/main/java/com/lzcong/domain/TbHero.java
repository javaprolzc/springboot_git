package com.lzcong.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Setter
@Getter
@ToString
@Table(name = "tb_hero")
public class TbHero {
    private Integer id;
    private String username;
    private String profession;
    private String phone;
    private String email;
    @Transient
    private Date onlinetime;
}
