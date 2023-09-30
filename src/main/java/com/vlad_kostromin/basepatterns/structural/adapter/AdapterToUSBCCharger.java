package main.java.com.vlad_kostromin.basepatterns.structural.adapter;

public class AdapterToUSBCCharger extends USBCCharger implements Charger{
    @Override
    public void charge() {
        usingUSBCCharger();
    }
}
