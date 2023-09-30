package main.java.com.vlad_kostromin.basepatterns.structural.bringe;

public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }

    @Override
    public void usefulFeature() {
        System.out.println("TV is showing television picture");
    }
}
