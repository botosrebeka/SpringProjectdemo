package com.example.SpringProjectdemo.controller;

import com.example.SpringProjectdemo.dto.ClubDto;
import com.example.SpringProjectdemo.entity.Club;
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

        List<ClubDto> clubDtoList = service.getClubList();
        model.addAttribute("clubList", clubDtoList);

        return "indexClub";
    }

    @GetMapping(value = "/indexAddClub")
    public String createClub(Model model){
        ClubDto clubDto = new ClubDto();
        model.addAttribute("club", clubDto);
        return "/indexAddClub";
    }

    @PostMapping(value = "/indexClub")
    public String submitClub(@ModelAttribute ClubDto clubDto){
        service.saveClub(clubDto);
        return "redirect:/indexClub";
    }

    @PostMapping(value="/deleteClub")
    public String deleteClub(@RequestParam("id") Club id){
        service.deleteClub(id);
        return "redirect:/indexClub";
    }

    @PostMapping(value="/editClub")
    public String editClub(@RequestParam("id") int id, Model model){
        ClubDto clubDto = service.findClubById(id);
        model.addAttribute("club", clubDto);
        return "indexAddClub";
    }
}
