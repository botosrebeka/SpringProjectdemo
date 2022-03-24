package com.example.SpringProjectdemo.controller;
import com.example.SpringProjectdemo.dto.PlayerDto;
import com.example.SpringProjectdemo.entity.Player;
import com.example.SpringProjectdemo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexPlayerController {

    @Autowired
    PlayerService service;

    @GetMapping(value = "/indexPlayer")
    public String getIndex(Model model){

        model.addAttribute("playerList", service.getPlayerList());

        List<PlayerDto> playerDtoList = service.getPlayerList();
        return "indexPlayer";
    }

    @GetMapping(value="/indexAddPlayer")
    public String createPlayer(Model model){
        PlayerDto playerDto = new PlayerDto();
        model.addAttribute("player", playerDto);
        return "indexAddPlayer";
    }

    @PostMapping(value="/deletePlayer")
    public String deletePlayer(@RequestParam("id_player") Player id_player){
        service.deletePlayer(id_player);
        return "redirect:/indexPlayer";
    }

    @PostMapping(value = "/indexPlayer")
    public String submitPlayer(@ModelAttribute PlayerDto playerDto){
        service.savePlayer(playerDto);
        return "redirect:/indexPlayer";
    }
    @PostMapping(value="/editPlayer")
    public String editPlayer(@RequestParam("id_player") int id_player, Model model){
        PlayerDto playerDto = service.findPlayerById(id_player);
        model.addAttribute("player", playerDto);
        return "indexAddPlayer";
    }

}
