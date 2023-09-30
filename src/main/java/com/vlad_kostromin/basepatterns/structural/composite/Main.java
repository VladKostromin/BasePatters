package main.java.com.vlad_kostromin.basepatterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Worker("John", 5000);
        Employee employee2 = new Worker("Frodo", 3000);

        GroupWorkers group1 = new GroupWorkers("FirstGroup");
        group1.addWorker(employee1);
        group1.addWorker(employee2);
        group1.showInfo();
    }
}
