package com.example.SpringProjectdemo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClubDto {
    private int id;
    private String club_name;
    private String location;
    private String coach;
}
