package com.codex.patterns.creation.abstractfactory;

public class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }
    public Table createTable() {
        return new VictorianTable();
    }
}
