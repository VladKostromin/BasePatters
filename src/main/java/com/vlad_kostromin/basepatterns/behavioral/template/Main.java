package main.java.com.vlad_kostromin.basepatterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea("yes");
        Beverage coffee = new Coffee("yes");
        tea.prepareBeverage();
        System.out.println("===============");
        coffee.prepareBeverage();
    }
}
