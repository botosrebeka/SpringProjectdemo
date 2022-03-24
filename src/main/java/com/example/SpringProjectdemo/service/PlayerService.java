package com.example.SpringProjectdemo.service;

import com.example.SpringProjectdemo.model.Player;
import com.example.SpringProjectdemo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getPlayerList(){
        return playerRepository.findAll();
    }

    public void savePlayer(Player player){
        playerRepository.save(player);
    }

    public void deletePlayer(Player player) {
        playerRepository.delete(player);
    }

    public void deletePlayer(int id_player) {
        playerRepository.deleteById(id_player);
    }
}
