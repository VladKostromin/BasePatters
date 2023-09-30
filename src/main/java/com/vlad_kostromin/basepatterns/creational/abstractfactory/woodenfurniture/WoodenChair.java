package main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.woodenfurniture;

import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.Chair;

public class WoodenChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a wooden chair.");
    }
}
