package main.java.com.vlad_kostromin.basepatterns.behavioral.state;

public class FanHighState implements FanState{
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning on high speed");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the fan");
    }
}
