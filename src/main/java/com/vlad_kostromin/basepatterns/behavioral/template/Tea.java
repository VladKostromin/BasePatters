package main.java.com.vlad_kostromin.basepatterns.behavioral.template;

public class Tea extends Beverage{

    public Tea(String condiments) {
        super(condiments);
    }

    @Override
    void brew() {
        System.out.println("Putting tea bag");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
