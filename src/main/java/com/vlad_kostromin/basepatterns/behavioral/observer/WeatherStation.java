package main.java.com.vlad_kostromin.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observed{
    private List<Observer> observers = new ArrayList<>();
    private double temperature;
    private double humidity;

    public void setWeather(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
