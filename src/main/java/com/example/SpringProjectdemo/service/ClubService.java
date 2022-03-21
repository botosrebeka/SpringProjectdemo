package com.example.SpringProjectdemo.service;

import com.example.SpringProjectdemo.model.Club;
import com.example.SpringProjectdemo.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClubService {

    List<Club> clubList = new ArrayList<>();

    public List<Club> getClubList(){
        return clubList;
    }

    public void saveClub(Club club){
        clubList.add(club);
    }

}
