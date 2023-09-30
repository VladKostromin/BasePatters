package main.java.com.vlad_kostromin.basepatterns.structural.bringe;

public class UniversalRemoteControl extends RemoteControl {
    public UniversalRemoteControl(Device device) {
        super(device);
    }

    @Override
    void powerOn() {
        device.turnOn();
    }

    @Override
    void powerOff() {
        device.turnOff();
    }

    @Override
    void useDevice() {
        device.usefulFeature();
    }
}
