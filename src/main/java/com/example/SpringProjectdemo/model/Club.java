package com.example.SpringProjectdemo.model;

import javax.persistence.*;

@Entity
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

    public Club(){}

    public Club(int id_club, String club_name, String full_name, String location, String owner, String chairman, String coach) {
        this.id_club = id_club;
        this.club_name = club_name;
        this.full_name = full_name;
        this.location = location;
        this.owner = owner;
        this.chairman = chairman;
        this.coach = coach;
    }

    public int getId_club() {
        return id_club;
    }

    public void setId_club(int id_club) {
        this.id_club = id_club;
    }

    public String getClub_name() {
        return club_name;
    }

    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
}
