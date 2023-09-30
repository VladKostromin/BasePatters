package main.java.com.vlad_kostromin.basepatterns.structural.composite;

public class Worker implements Employee {
    private String name;
    private double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showInfo() {
        System.out.println("Employee: " + name + " salary: " + salary);
    }
}
