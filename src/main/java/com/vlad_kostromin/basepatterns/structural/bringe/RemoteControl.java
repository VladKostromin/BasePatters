package main.java.com.vlad_kostromin.basepatterns.structural.bringe;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void powerOn();
    abstract void powerOff();
    abstract void useDevice();
}
