package main.java.com.vlad_kostromin.basepatterns.behavioral.command;

public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnIn();
    }
}
