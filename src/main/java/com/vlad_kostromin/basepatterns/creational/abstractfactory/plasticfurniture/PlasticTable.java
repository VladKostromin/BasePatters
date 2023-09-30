package main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.plasticfurniture;

import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.Table;

public class PlasticTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Putting something on plastic table.");
    }
}
