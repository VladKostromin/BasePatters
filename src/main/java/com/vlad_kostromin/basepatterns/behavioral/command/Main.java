package main.java.com.vlad_kostromin.basepatterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command commandToOn = new LightOnCommand(light);
        Command commandToOff = new LightOffCommand(light);

        commandToOn.execute();
        commandToOff.execute();

    }
}
