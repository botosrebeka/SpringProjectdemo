package com.example.SpringProjectdemo.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.SpringProjectdemo.model.Player;
import com.example.SpringProjectdemo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @PostMapping(value = "/indexPlayer")
    public String submitPlayer(@ModelAttribute Player player){
        service.savePlayer(player);
        return "redirect:/indexPlayer";
    }


}
