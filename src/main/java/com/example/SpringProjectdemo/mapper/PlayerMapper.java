package com.example.SpringProjectdemo.mapper;

import com.example.SpringProjectdemo.dto.PlayerDto;
import com.example.SpringProjectdemo.entity.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    public PlayerDto mapPlayerDto(Player player) {
        PlayerDto playerDto = new PlayerDto();
        playerDto.setId_player(player.getId_player());
        playerDto.setFirstName(player.getFirstName());
        playerDto.setLastName(player.getLastName());
        playerDto.setAge(player.getAge());
        playerDto.setSalary(player.getSalary());
        playerDto.setGoals(player.getGoals());
        playerDto.setPosition(player.getPosition());
        playerDto.setPlace_of_birth(player.getPlace_of_birth());
        playerDto.setClub_name(player.getClub_name());
        return playerDto;
    }

    public Player mapPlayer(PlayerDto playerDto) {
        Player player = new Player();
        player.setId_player(playerDto.getId_player());
        player.setFirstName(playerDto.getFirstName());
        player.setLastName(playerDto.getLastName());
        player.setAge(playerDto.getAge());
        player.setSalary(playerDto.getSalary());
        player.setGoals(playerDto.getGoals());
        player.setPosition(playerDto.getPosition());
        player.setPlace_of_birth(playerDto.getPlace_of_birth());
        player.setClub_name(playerDto.getClub_name());
        return player;
    }
}
