package main.java.com.vlad_kostromin.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GroupWorkers implements Employee {
    private String groupName;
    private List<Employee> employeeList;

    public GroupWorkers(String groupName) {
        this.groupName = groupName;
        this.employeeList = new ArrayList<>();
    }
    public void addWorker(Employee employee) {
        employeeList.add(employee);
    }
    public void deleteWorker(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public void showInfo() {
        System.out.println("Name of workers group: " + groupName);
        for (Employee employee : employeeList) {
            employee.showInfo();
        }
    }
}
