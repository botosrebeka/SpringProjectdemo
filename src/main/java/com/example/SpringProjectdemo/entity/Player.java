package com.example.SpringProjectdemo.entity;


import javax.persistence.*;

@Entity
@Table(name = "t_player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_player;

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
    @Column(name = "club_name")
    private String club_name;

    public Player(){

    }

    public Player(int id_player, String firstName, String lastName, int age, int salary, int goals, String position, String place_of_birth, String club) {
        this.id_player = id_player;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.goals = goals;
        this.position = position;
        this.place_of_birth = place_of_birth;
        this.club_name = club;
    }

    public int getId_player() {
        return id_player;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getClub_name() {
        return club_name;
    }

    public void setClub_name(String club) {
        this.club_name = club;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
