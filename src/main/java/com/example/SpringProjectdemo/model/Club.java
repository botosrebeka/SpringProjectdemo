package com.example.SpringProjectdemo.model;

public class Club {
    private String name;
    private String short_name;
    private String location;
    private String owner;
    private String chairman;
    private String coach;

    public Club(String name, String short_name, String location, String owner, String chairman, String coach) {
        this.name = name;
        this.short_name = short_name;
        this.location = location;
        this.owner = owner;
        this.chairman = chairman;
        this.coach = coach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
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
