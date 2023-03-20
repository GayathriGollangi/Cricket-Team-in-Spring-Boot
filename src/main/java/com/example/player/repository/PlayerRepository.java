// Write your code here
package com.example.player.repository;

import java.util.ArrayList;

import com.example.player.model.Player;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player getPlayerId(int playerId);
    
    Player addPlayer(Player player);
    
    Player updatePlayer(int playerId, Player player);
    
    void deletePlayer(int playerId);

}