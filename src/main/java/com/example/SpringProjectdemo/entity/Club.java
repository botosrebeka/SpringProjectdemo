package com.example.SpringProjectdemo.entity;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table (name = "t_club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_club;

    @Column(name = "club_name")
    private String club_name;
    @Column(name = "full_name")
    private String full_name;
    @Column(name = "location")
    private String location;
    @Column(name = "owner")
    private String owner;
    @Column(name = "chairman")
    private String chairman;
    @Column(name = "coach")
    private String coach;

}
