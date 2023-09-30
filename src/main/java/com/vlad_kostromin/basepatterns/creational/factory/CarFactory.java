package main.java.com.vlad_kostromin.basepatterns.creational.factory;

public class CarFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
