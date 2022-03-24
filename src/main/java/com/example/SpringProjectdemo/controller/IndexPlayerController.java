package com.example.SpringProjectdemo.controller;
import com.example.SpringProjectdemo.model.Player;
import com.example.SpringProjectdemo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexPlayerController {

    @Autowired
    PlayerService service;

    @GetMapping(value = "/indexPlayer")
    public String getIndex(Model model){

        model.addAttribute("playerList", service.getPlayerList());

        return "indexPlayer";
    }

    @GetMapping(value="/indexAddPlayer")
    public String createPlayer(Model model){
        Player player = new Player();
        model.addAttribute("player", player);
        return "indexAddPlayer";
    }
    @PostMapping(value="/deletePlayer")
    public String deletePlayer(@RequestParam("id_player") Player id_player){
        service.deletePlayer(id_player);
        return "redirect:/indexPlayer";
    }

    @PostMapping(value = "/indexPlayer")
    public String submitPlayer(@ModelAttribute Player player){
        service.savePlayer(player);
        return "redirect:/indexPlayer";
    }


}
