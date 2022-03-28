package com.example.SpringProjectdemo.mapper;

import com.example.SpringProjectdemo.dto.PlayerDto;
import com.example.SpringProjectdemo.entity.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    public PlayerDto mapPlayerDto(Player player) {
        return PlayerDto.builder()
                .id_player(player.getId_player())
                .firstName(player.getFirstName())
                .lastName(player.getLastName())
                .age(player.getAge())
                .salary(player.getSalary())
                .goals(player.getGoals())
                .position(player.getPosition())
                .place_of_birth(player.getPlace_of_birth())
                .id_club(player.getId_club())
                .build();
    }

    public Player mapPlayer(PlayerDto playerDto) {
        return Player.builder()
                .id_player(playerDto.getId_player())
                .firstName(playerDto.getFirstName())
                .lastName(playerDto.getLastName())
                .age(playerDto.getAge())
                .salary(playerDto.getSalary())
                .goals(playerDto.getGoals())
                .position(playerDto.getPosition())
                .place_of_birth(playerDto.getPlace_of_birth())
                .id_club(playerDto.getId_club())
                .build();
    }
}
