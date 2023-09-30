package main.java.com.vlad_kostromin.basepatterns.behavioral.mediator;

public class GameRunner {
    public static void main(String[] args) {
        GameMediator gameWorld = new GameWorld();
        Player player1 = new GameUser("Player 1", gameWorld);
        Player player2 = new GameUser("Player 2",gameWorld);
        Player player3 = new GameUser("Player 3",gameWorld);
        Player player4 = new GameUser("Player 4",gameWorld);
        Player player5 = new GameUser("Player 5",gameWorld);

        gameWorld.registerPlayer(player1);
        gameWorld.registerPlayer(player2);
        gameWorld.registerPlayer(player3);
        gameWorld.registerPlayer(player4);
        gameWorld.registerPlayer(player5);
        player1.sendMessage("Hello, let's rock!");
        player3.sendMessage("Hello everyone!");
    }
}
