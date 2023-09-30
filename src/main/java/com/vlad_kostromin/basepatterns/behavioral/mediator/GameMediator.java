package main.java.com.vlad_kostromin.basepatterns.behavioral.mediator;

public interface GameMediator {
    void registerPlayer(Player player);
    void sendMessage(String message, Player player);
}
