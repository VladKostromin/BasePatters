package main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory;

import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.plasticfurniture.PlasticFurnitureFactory;
import main.java.com.vlad_kostromin.basepatterns.creational.abstractfactory.woodenfurniture.WoodenFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory woodenFactory = new WoodenFurnitureFactory();
        FurnitureFactory plasticFactory = new PlasticFurnitureFactory();

        Chair woodenChair = woodenFactory.createChair();
        woodenChair.sitOn();

        Table woodenTable = woodenFactory.createTable();
        woodenTable.putOn();

        Chair plasticChair = plasticFactory.createChair();
        plasticChair.sitOn();

        Table plasticTable = plasticFactory.createTable();
        plasticTable.putOn();
    }
}
