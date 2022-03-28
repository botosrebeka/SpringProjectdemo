package com.example.SpringProjectdemo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDto {
    private int id_player;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private int goals;
    private String position;
    private String place_of_birth;
    private int id_club;
}
