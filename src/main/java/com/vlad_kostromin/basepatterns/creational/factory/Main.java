package main.java.com.vlad_kostromin.basepatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = createTransportByType("motorcycle");
        Transport transport = transportFactory.createTransport();

        transport.drive();
    }

    static TransportFactory createTransportByType(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new CarFactory();
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new MotorcycleFactory();
        } else if (type.equalsIgnoreCase("bus")) {
            return new BusFactory();
        } else {
            throw new IllegalArgumentException(type + " is unknown type of transport");
        }
    }
}
