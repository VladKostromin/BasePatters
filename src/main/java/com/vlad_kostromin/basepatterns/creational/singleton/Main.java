package main.java.com.vlad_kostromin.basepatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("App name: " + AppSettings.getSettings().getName());
        System.out.println("Max connections: " + AppSettings.getSettings().getMaxConnections());
        System.out.println(AppSettings.getSettings());

        AppSettings.getSettings().setName("SomeNewAppName");
        AppSettings.getSettings().setMaxConnections(15);

        System.out.println("App new name: " + AppSettings.getSettings().getName());
        System.out.println("New max connections: " + AppSettings.getSettings().getMaxConnections());
        System.out.println(AppSettings.getSettings());
    }
}
