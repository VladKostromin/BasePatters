package main.java.com.vlad_kostromin.basepatterns.creational.factory;

public class MotorcycleFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Motorcycle();
    }
}
