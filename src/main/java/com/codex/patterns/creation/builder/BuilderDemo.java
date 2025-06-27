package com.codex.patterns.creation.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println("Computer built: HDD=" + computer.getHDD() + ", RAM=" + computer.getRAM() + ", Bluetooth=" + computer.isBluetoothEnabled() + ", GraphicsCard=" + computer.isGraphicsCardEnabled());
    }
}
