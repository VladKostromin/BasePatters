package main.java.com.vlad_kostromin.basepatterns.creational.builder;

public class IphoneOrderBuilder extends OrderBuilder{
    @Override
    void buildName() {
        order.setName("IPhone");
    }

    @Override
    void buildQuantity(int quantity) {
        order.setQuantity(quantity);
    }

    @Override
    void buildPrice() {
        order.setPrice(1300);
        super.buildPrice();
    }
}
