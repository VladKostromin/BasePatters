package main.java.com.vlad_kostromin.basepatterns.behavioral.observer;

public class WeatherRunner {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherMonitor monitor1 = new WeatherMonitor("Monitor 1");
        WeatherMonitor monitor2 = new WeatherMonitor("Monitor 2");
        WeatherMonitor monitor3 = new WeatherMonitor("Monitor 3");

        weatherStation.registerObserver(monitor1);
        weatherStation.registerObserver(monitor2);
        weatherStation.registerObserver(monitor3);

        weatherStation.setWeather(25.3, 60.0);
        weatherStation.setWeather(25.3, 77.0);
        weatherStation.removeObserver(monitor3);
        weatherStation.setWeather(15.4, 59.9);
    }
}
