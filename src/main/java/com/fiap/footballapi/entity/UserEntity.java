package com.fiap.footballapi.entity;

import javax.persistence.*;

@Entity
@Table(name= "TB_USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    private Long getId() {
        return id;
    }
}
