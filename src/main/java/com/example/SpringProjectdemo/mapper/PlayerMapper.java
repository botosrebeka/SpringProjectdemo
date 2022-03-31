package com.example.SpringProjectdemo.mapper;

import com.example.SpringProjectdemo.dto.PlayerDto;
import com.example.SpringProjectdemo.entity.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    public PlayerDto mapPlayerDto(Player player) {
        return PlayerDto.builder()
                .id(player.getId())
                .firstName(player.getFirstName())
                .lastName(player.getLastName())
                .age(player.getAge())
                .salary(player.getSalary())
                .goals(player.getGoals())
                .position(player.getPosition())
                .place_of_birth(player.getPlace_of_birth())
                .club_name(player.getClub().getClub_name())
                .build();
    }

    public Player mapPlayer(PlayerDto playerDto) {
        return Player.builder()
                .id(playerDto.getId())
                .firstName(playerDto.getFirstName())
                .lastName(playerDto.getLastName())
                .age(playerDto.getAge())
                .salary(playerDto.getSalary())
                .goals(playerDto.getGoals())
                .position(playerDto.getPosition())
                .place_of_birth(playerDto.getPlace_of_birth())
               // .id_club(playerDto.getId_club())
                .build();
    }
}
