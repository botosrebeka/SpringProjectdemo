package com.example.SpringProjectdemo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username", unique=true)
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
}
