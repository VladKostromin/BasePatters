package main.java.com.vlad_kostromin.basepatterns.creational.factory;

public class BusFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Bus();
    }
}
