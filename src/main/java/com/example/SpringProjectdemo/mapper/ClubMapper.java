package com.example.SpringProjectdemo.mapper;

import com.example.SpringProjectdemo.dto.ClubDto;
import com.example.SpringProjectdemo.entity.Club;
import org.springframework.stereotype.Component;

@Component
public class ClubMapper {
    public ClubDto mapClubDto(Club club) {
        ClubDto clubDto = new ClubDto();
        clubDto.setId_club(club.getId_club());
        clubDto.setClub_name(club.getClub_name());
        clubDto.setFull_name(club.getFull_name());
        clubDto.setLocation(club.getLocation());
        clubDto.setOwner(club.getOwner());
        clubDto.setChairman(club.getChairman());
        clubDto.setCoach(club.getCoach());
        return clubDto;
    }

    public Club mapClub(ClubDto clubDto) {
        Club club = new Club();
        club.setId_club(clubDto.getId_club());
        club.setClub_name(clubDto.getClub_name());
        club.setFull_name(clubDto.getFull_name());
        club.setLocation(clubDto.getLocation());
        club.setOwner(clubDto.getOwner());
        club.setChairman(club.getChairman());
        club.setCoach(clubDto.getCoach());
        return club;
    }
}
