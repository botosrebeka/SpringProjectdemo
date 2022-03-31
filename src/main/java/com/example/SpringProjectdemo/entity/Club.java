package com.example.SpringProjectdemo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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
    private int id;

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

    @OneToMany(mappedBy="club",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<Player> playerList;

}
