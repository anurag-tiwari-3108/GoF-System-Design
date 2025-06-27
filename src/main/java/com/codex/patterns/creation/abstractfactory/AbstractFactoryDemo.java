package com.codex.patterns.creation.abstractfactory;

// Layman Example: Furniture Factory (Chair/Table, Modern/Victorian)
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
        modernChair.sitOn();
        modernTable.placeItem();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();
        victorianChair.sitOn();
        victorianTable.placeItem();
    }
}
