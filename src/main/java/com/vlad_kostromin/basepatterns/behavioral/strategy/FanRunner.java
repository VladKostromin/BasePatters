package main.java.com.vlad_kostromin.basepatterns.behavioral.strategy;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setState(new FanLowState());
        fan.turnOn();

        fan.setState(new FanMediumState());
        fan.turnOn();

        fan.setState(new FanHighState());
        fan.turnOn();

        fan.turnOff();
    }
}
