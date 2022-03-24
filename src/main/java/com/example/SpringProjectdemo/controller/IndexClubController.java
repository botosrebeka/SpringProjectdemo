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
import org.springframework.web.bind.annotation.RequestParam;

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
        service.saveClub(club);
        return "redirect:/indexClub";
    }

    @PostMapping(value="/deleteClub")
    public String deleteClub(@RequestParam("id_club") Club id_club){
        service.deleteClub(id_club);
        return "redirect:/indexClub";
    }


}
