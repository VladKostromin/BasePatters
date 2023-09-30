package main.java.com.vlad_kostromin.basepatterns.behavioral.mediator;

public class GameUser implements Player {
    private String playerName;
    private GameMediator gameWorld;

    public GameUser(String playerName, GameMediator gameWorld) {
        this.playerName = playerName;
        this.gameWorld = gameWorld;
    }



    @Override
    public void sendMessage(String message) {
        System.out.println(playerName + " sends: " + message);
        gameWorld.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(playerName + " receives: " + message);
    }
}
