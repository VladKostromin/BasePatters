package main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.woodenfurniture;

import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.Table;

public class WoodenTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Putting something on a wooden table");
    }
}
