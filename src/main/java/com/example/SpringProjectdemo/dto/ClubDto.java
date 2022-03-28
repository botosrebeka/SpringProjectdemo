package com.example.SpringProjectdemo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClubDto {
    private int id_club;
    private String club_name;
    private String full_name;
    private String location;
    private String owner;
    private String chairman;
    private String coach;
}
