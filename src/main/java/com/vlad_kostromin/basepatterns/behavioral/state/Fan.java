package main.java.com.vlad_kostromin.basepatterns.behavioral.state;

public class Fan {
    private FanState state = new FanLowState();

    public void setState(FanState state) {
        this.state = state;
    }

    public void turnOn() {
        state.turnOn();
    }

    public void turnOff() {
        state.turnOff();
    }

    public void switchState() {
        if(state instanceof FanLowState){
            setState(new FanMediumState());
            turnOn();
        } else if(state instanceof  FanMediumState) {
            setState(new FanHighState());
            turnOn();
        } else if (state instanceof FanHighState) {
            setState(new FanLowState());
            turnOn();
        }
    }
}
