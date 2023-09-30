package main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.plasticfurniture;

import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.Chair;
import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.FurnitureFactory;
import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.Table;

public class PlasticFurnitureFactory implements FurnitureFactory {
    @Override
    public Table createTable() {
        return new PlasticTable();
    }

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }
}
