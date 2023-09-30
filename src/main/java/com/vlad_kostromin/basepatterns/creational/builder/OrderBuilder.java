package main.java.com.vlad_kostromin.basepatterns.creational.builder;

public abstract class OrderBuilder {
    Order order;

    void createOrder() {
        order = new Order();
    }

    abstract void buildName();
    abstract void buildQuantity(int quantity);
    void buildPrice() {
        order.setPrice(order.getQuantity() * order.getPrice());
    }

    public Order getOrder() {
        return order;
    }
}
