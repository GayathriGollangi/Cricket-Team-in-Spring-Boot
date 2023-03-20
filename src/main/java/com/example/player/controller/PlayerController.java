package com.example.player.controller;

import java.util.ArrayList;

import com.example.player.model.Player;
import com.example.player.service.PlayerH2Service;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

/*
 * 
 * You can use the following import statemets
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */
 @RestController
 public class PlayerController{
    @Autowired
   public PlayerH2Service playerService;

   @GetMapping("/players")
   public ArrayList<Player> getPlayers(){
     return playerService.getPlayers();
   }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerId(playerId);
    }

    @PostMapping("/players")
    public Player addBook(@RequestBody Player player) {
        return playerService.addPlayer(player);
    } 

    @PutMapping("/players/{playerId}")
    public Player updateBook(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerService.updatePlayer(playerId, player);
    }  

    @DeleteMapping("/players/{playerId}")
    public void deleteBook(@PathVariable("playerId") int playerId){
        playerService.deletePlayer(playerId);
    }

 }
