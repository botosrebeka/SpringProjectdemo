package com.example.SpringProjectdemo.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "t_player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "salary")
    private int salary;
    @Column(name = "goals")
    private int goals;
    @Column(name = "position")
    private String position;
    @Column(name = "place_of_birth")
    private String place_of_birth;

    @ManyToOne
    @JoinColumn(name="id_club")
    private Club club;
}
