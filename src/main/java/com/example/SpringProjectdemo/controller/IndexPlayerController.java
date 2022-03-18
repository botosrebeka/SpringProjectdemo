package com.example.SpringProjectdemo.controller;

import com.example.SpringProjectdemo.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexPlayerController {
    @GetMapping(value = "/indexPlayer")
    public String getIndex(Model model){

        List<Player> playerList = List.of(
                new Player("Max","Munteanu",25,500,"Central","Brasov"),
                new Player("Max1","Munteanu1",26,580,"Central7","Brasov"),
                new Player("Max1","Munteanu1",26,580,"Central7","Brasov"),
                new Player("Max1","Munteanu1",26,580,"Central7","Brasov")
        );

        model.addAttribute("playerList", playerList);

        return "indexPlayer";
    }

    @GetMapping(value = "/indexAddPlayer")
    public String getIndex(){
        return "indexAddPlayer";
    }
}
