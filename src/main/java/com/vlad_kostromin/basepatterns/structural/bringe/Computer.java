package main.java.com.vlad_kostromin.basepatterns.structural.bringe;

public class Computer implements Device{
    @Override
    public void turnOn() {
        System.out.println("Computer is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer is OFF");
    }

    @Override
    public void usefulFeature() {
        System.out.println("Computer is doing calculation");
    }
}
