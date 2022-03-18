package com.example.SpringProjectdemo.controller;

import com.example.SpringProjectdemo.model.Club;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexClubController {

    @GetMapping(value = "/indexClub")
    public String getIndex(Model model){
        List<Club> clubList = List.of(
                new Club("Asociația Club Sportiv Sepsi OSK Sfântu Gheorghe","OSK","Sfântu Gheorghe","László Diószegi","Attila Hadnagy","Cristiano Bergodi"),
                new Club("Fotbal Club Dinamo București","Dinamo","București","Dorin Șerdean","Constantin Eftimescu","Dušan Uhrin Jr."),
                new Club("Clubul Sportiv al Armatei Steaua București","Steaua","București","Ministry of National Defence","Ștefan Răzvan Bichir","?"),
                new Club("SC Fotbal Club CFR 1907 Cluj SA","CFR","Cluj","Ioan Varga","Cristian Balaj","Dan Petrescu")
        );

        model.addAttribute("clubList",clubList);

        return "indexClub";
    }

    @GetMapping(value = "/indexAddClub")
    public String getIndex(){
        return "indexAddClub";
    }


}
