package main.java.com.vlad_kostromin.basepatterns.creational.singleton;

public class AppSettings {
    private static AppSettings instance;

    private String name;
    private int maxConnections;

    private AppSettings() {
        name = "My Singleton app";
        maxConnections = 10;
    }

    public static synchronized AppSettings getSettings() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }
}
