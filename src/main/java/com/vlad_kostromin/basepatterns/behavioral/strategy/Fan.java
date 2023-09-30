package main.java.com.vlad_kostromin.basepatterns.behavioral.strategy;

public class Fan {
    private FanState state;

    public void setState(FanState state) {
        this.state = state;
    }

    public void turnOn() {
        state.turnOn();
    }

    public void turnOff() {
        state.turnOff();
    }

}
