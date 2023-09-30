package main.java.com.vlad_kostromin.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class GameWorld implements GameMediator {
    private List<Player> playerList= new ArrayList<>();

    @Override
    public void registerPlayer(Player player) {
        playerList.add(player);
    }

    @Override
    public void sendMessage(String message, Player player) {
        for (Player p : playerList) {
            if(p != player) p.receiveMessage(message);
        }
    }
}
