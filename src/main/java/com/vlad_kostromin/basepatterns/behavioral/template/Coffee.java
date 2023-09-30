package main.java.com.vlad_kostromin.basepatterns.behavioral.template;

public class Coffee extends Beverage{

    public Coffee(String condiments) {
        super(condiments);
    }

    @Override
    void brew() {
        System.out.println("Putting coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
