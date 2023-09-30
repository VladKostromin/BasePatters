package main.java.com.vlad_kostromin.basepatterns.structural.facade;

public class CarFacade {
    private Engine engine = new Engine();
    private ElectricalSystem electricalSystem = new ElectricalSystem();
    private FuelSystem fuelSystem = new FuelSystem();

    public void startCar() {
        engine.start();
        fuelSystem.injectFuel();
        electricalSystem.powerOn();;
    }

    public void stopCar() {
        engine.stop();
        fuelSystem.stopInjection();
        electricalSystem.powerOff();
    }
}
