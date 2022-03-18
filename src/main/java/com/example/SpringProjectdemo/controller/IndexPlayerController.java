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
                new Player(1,"Max","Munteanu",25,500,10,"Central","Brasov","OSK"),
                new Player(2,"Max1","Munteanu1",26,580,20,"Central7","Brasov","OsK"),
                new Player(3,"Max1","Munteanu1",26,580,5,"Central7","Brasov","OSK"),
                new Player(4,"Max1","Munteanu1",26,580,21,"Central7","Brasov","OSK"),
                new Player(5,"Max","Munteanu",25,500,10,"Central","Brasov","OSK"),
                new Player(6,"Max1","Munteanu1",26,580,20,"Central7","Brasov","OsK"),
                new Player(7,"Max1","Munteanu1",26,580,5,"Central7","Brasov","OSK"),
                new Player(8,"Max1","Munteanu1",26,580,21,"Central7","Brasov","OSK"),
                new Player(9,"Max","Munteanu",25,500,10,"Central","Brasov","OSK"),
                new Player(10,"Max1","Munteanu1",26,580,20,"Central7","Brasov","OsK"),
                new Player(11,"Max1","Munteanu1",26,580,5,"Central7","Brasov","OSK"),
                new Player(12,"Max1","Munteanu1",26,580,21,"Central7","Brasov","OSK"),
                new Player(13,"Max","Munteanu",25,500,10,"Central","Brasov","OSK"),
                new Player(14,"Max1","Munteanu1",26,580,20,"Central7","Brasov","OsK"),
                new Player(15,"Max1","Munteanu1",26,580,5,"Central7","Brasov","OSK"),
                new Player(16,"Max1","Munteanu1",26,580,21,"Central7","Brasov","OSK")
        );

        model.addAttribute("playerList", playerList);

        return "indexPlayer";
    }

    @GetMapping(value = "/indexAddPlayer")
    public String getIndex(){
        return "indexAddPlayer";
    }
}
