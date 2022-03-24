package com.example.SpringProjectdemo.service;

import com.example.SpringProjectdemo.model.Club;
import com.example.SpringProjectdemo.model.Player;
import com.example.SpringProjectdemo.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClubService {

    @Autowired
    ClubRepository clubRepository;

    public List<Club> getClubList(){
        return clubRepository.findAll();
    }

    public void saveClub(Club club){
        clubRepository.save(club);
    }

    public void deleteClub(Club club) {
        clubRepository.delete(club);
    }



}
