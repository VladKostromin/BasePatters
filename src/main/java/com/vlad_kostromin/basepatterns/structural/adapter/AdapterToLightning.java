package main.java.com.vlad_kostromin.basepatterns.structural.adapter;

public class AdapterToLightning extends LightningCharger implements Charger{
    @Override
    public void charge() {
        usingLightningCharger();
    }
}
