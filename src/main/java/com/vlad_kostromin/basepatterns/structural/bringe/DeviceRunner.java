package main.java.com.vlad_kostromin.basepatterns.structural.bringe;

public class DeviceRunner {
    public static void main(String[] args) {
        Device computer = new Computer();
        RemoteControl control = new UniversalRemoteControl(computer);

        Device tv = new TV();
        RemoteControl tvControl = new UniversalRemoteControl(tv);

        control.powerOn();
        control.useDevice();
        control.powerOff();

        tvControl.powerOn();
        tvControl.useDevice();
        tvControl.powerOff();
    }
}
