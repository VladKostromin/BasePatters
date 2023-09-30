package main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.woodenfurniture;

import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.Chair;
import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.FurnitureFactory;
import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.Table;

public class WoodenFurnitureFactory implements FurnitureFactory {
    @Override
    public Table createTable() {
        return new WoodenTable();
    }

    @Override
    public Chair createChair() {
        return new WoodenChair();
    }
}
