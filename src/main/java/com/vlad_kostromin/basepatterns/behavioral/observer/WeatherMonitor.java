package main.java.com.vlad_kostromin.basepatterns.behavioral.observer;

public class WeatherMonitor implements Observer{
    private String monitorName;

    public WeatherMonitor(String monitorName) {
        this.monitorName = monitorName;
    }

    @Override
    public void update(double temperature, double humidity) {
        System.out.println(monitorName + " - Current Temperature: " + temperature +
                "`C, Humidity: " + humidity + "%" + "\n==============================");
    }
}
