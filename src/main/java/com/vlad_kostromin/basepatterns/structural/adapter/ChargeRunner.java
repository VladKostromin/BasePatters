package main.java.com.vlad_kostromin.basepatterns.structural.adapter;

public class ChargeRunner {
    public static void main(String[] args) {
        Charger lightningCharger = new AdapterToLightning();
        lightningCharger.charge();
        Charger usbCharger = new AdapterToUSBCCharger();
        usbCharger.charge();
    }
}
