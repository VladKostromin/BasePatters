package main.java.com.vlad_kostromin.basepatterns.creational.factory;

public class Car implements Transport {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}
