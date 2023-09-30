package main.java.com.vlad_kostromin.basepatterns.creational.builder;

public class Customer {
    OrderBuilder builder;
    int quantity;

    public void setOrderBuilder(OrderBuilder orderBuilder, int quantity) {
        this.builder = orderBuilder;
        this.quantity = quantity;
    }

    public Order buildOrder() {
        builder.createOrder();
        builder.buildName();
        builder.buildQuantity(quantity);
        builder.buildPrice();

        return builder.getOrder();
    }
}
