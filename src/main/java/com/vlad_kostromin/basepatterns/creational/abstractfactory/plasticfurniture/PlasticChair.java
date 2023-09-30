package main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.plasticfurniture;

import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.Chair;

public class PlasticChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on plastic chair.");
    }
}
