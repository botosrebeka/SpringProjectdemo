package com.example.SpringProjectdemo.controller;

import com.example.SpringProjectdemo.model.Club;
import com.example.SpringProjectdemo.model.Player;
import com.example.SpringProjectdemo.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class IndexClubController {

    @Autowired
    ClubService service;

    @GetMapping(value = "/indexClub")

    public String getIndex(Model model){

      //  ClubService service = new ClubService();

        model.addAttribute("clubList", service.getClubList());

        return "indexClub";
    }

    @GetMapping(value = "/indexAddClub")
    public String createClub(Model model){
        Club club = new Club();
        model.addAttribute("club", club);
        return "/indexAddClub";
    }

    @PostMapping(value = "/indexClub")
    public String submitClub(@ModelAttribute Club club){
        System.out.println(club.getClub_name());
        System.out.println(club.getFull_name());
        System.out.println(club.getLocation());
        System.out.println(club.getOwner());
        System.out.println(club.getChairman());
        System.out.println(club.getCoach());
        service.saveClub(club);
        return "redirect:/indexClub";
    }


}
