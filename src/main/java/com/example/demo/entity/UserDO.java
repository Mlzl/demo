package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
@Data
public class UserDO {
    @Id
    private Long id;

    @Column(length = 16, nullable = false)
    private String username;

    @Column(length = 32, nullable = false)
    private String create_at;
}
