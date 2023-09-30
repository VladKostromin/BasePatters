package main.java.com.vlad_kostromin.basepatterns.creational.builder;

public class LaptopOrderBuilder extends OrderBuilder {

    @Override
    void buildName() {
        order.setName("MacBook");
    }

    @Override
    void buildQuantity(int quantity) {
        order.setQuantity(quantity);
    }

    @Override
    void buildPrice() {
        order.setPrice(3000);
        super.buildPrice();
    }
}
