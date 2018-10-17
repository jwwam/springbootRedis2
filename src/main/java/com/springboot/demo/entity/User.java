package com.springboot.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @ClassName: User
 * @Auther: zhangyingqi
 * @Date: 2018/8/27 17:17
 * @Description:
 */
@Entity
@Table(name = "user")
@Data
public class User extends BaseEntity implements Serializable {
    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "age")
    private int age;
}
