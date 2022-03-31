package com.example.SpringProjectdemo.mapper;

import com.example.SpringProjectdemo.dto.ClubDto;
import com.example.SpringProjectdemo.entity.Club;
import org.springframework.stereotype.Component;

@Component
public class ClubMapper {
    public ClubDto mapClubDto(Club club) {
        return ClubDto.builder()
                .id(club.getId())
                .club_name(club.getClub_name())
                .full_name(club.getFull_name())
                .location(club.getLocation())
                .owner(club.getOwner())
                .chairman(club.getChairman())
                .coach(club.getCoach())
                .build();
    }

    public Club mapClub(ClubDto clubDto) {
        return Club.builder()
                .id(clubDto.getId())
                .club_name(clubDto.getClub_name())
                .full_name(clubDto.getFull_name())
                .location(clubDto.getLocation())
                .owner(clubDto.getOwner())
                .chairman(clubDto.getChairman())
                .coach(clubDto.getCoach())
                .build();
    }
}
