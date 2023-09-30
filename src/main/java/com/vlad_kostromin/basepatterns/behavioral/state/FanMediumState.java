package main.java.com.vlad_kostromin.basepatterns.behavioral.state;

public class FanMediumState implements FanState{
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning on medium speed");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the fan");
    }
}
