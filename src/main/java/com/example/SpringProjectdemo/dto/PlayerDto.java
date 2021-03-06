package com.example.SpringProjectdemo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDto {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private int goals;
    private String position;
    private String place_of_birth;
    private String club_name;

}
