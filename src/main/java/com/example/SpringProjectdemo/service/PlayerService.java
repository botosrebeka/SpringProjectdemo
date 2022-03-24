package com.example.SpringProjectdemo.service;

import com.example.SpringProjectdemo.dto.PlayerDto;
import com.example.SpringProjectdemo.entity.Player;
import com.example.SpringProjectdemo.mapper.PlayerMapper;
import com.example.SpringProjectdemo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerMapper mapper;

    public List<PlayerDto> getPlayerList(){

        return playerRepository.findAll().stream()
                .map(p -> mapper.mapPlayerDto(p))
                .collect(Collectors.toList());
    }

    public void savePlayer(PlayerDto playerDto){
        Player player = mapper.mapPlayer(playerDto);
         playerRepository.save(player);

    }

    public void deletePlayer(Player player) {
        playerRepository.delete(player);
    }

    public PlayerDto findPlayerById(int id_player){
        Player player = playerRepository.findById(id_player).get();
        return mapper.mapPlayerDto(player);
    }

}
