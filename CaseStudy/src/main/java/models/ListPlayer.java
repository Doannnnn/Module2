package models;

import java.util.ArrayList;
import java.util.List;

public class ListPlayer {
    private List<Player> players;
    public ListPlayer(){
        players = new ArrayList<>();
    }
    public void addPlayer(Player player){
        players.add(player);
    }
    public List<Player> getPlayers(){
        return players;
    }
}
