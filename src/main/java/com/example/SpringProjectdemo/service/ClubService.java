package com.example.SpringProjectdemo.service;

import com.example.SpringProjectdemo.dto.ClubDto;
import com.example.SpringProjectdemo.entity.Club;
import com.example.SpringProjectdemo.mapper.ClubMapper;
import com.example.SpringProjectdemo.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubService {

    @Autowired
    ClubRepository clubRepository;

    @Autowired
    ClubMapper mapper;

    public List<ClubDto> getClubList(){

        return clubRepository.findAll().stream()
                .map(c ->mapper.mapClubDto(c))
                .collect(Collectors.toList());
    }

    public void saveClub(ClubDto clubDto){
        Club club = mapper.mapClub(clubDto);
        clubRepository.save(club);

    }

    public void deleteClub(Club club) {
        clubRepository.delete(club);
    }

    public ClubDto findClubById(int id_club){
        Club club = clubRepository.findById(id_club).get();
        return mapper.mapClubDto(club);
    }


}
