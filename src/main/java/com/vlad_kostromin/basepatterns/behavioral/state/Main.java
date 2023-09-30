package main.java.com.vlad_kostromin.basepatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.turnOn();
        fan.switchState();
        fan.switchState();
        fan.switchState();
        fan.turnOff();
    }
}
