package main.java.com.vlad_kostromin.basepatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setOrderBuilder(new LaptopOrderBuilder(), 1);
        Order order = customer.buildOrder();
        System.out.println(order);
    }
}
