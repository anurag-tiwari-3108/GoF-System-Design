package com.codex.patterns.structural.bridge;

public class TVRemote extends RemoteControl {
    public TVRemote(Device device) {
        super(device);
    }
    public void turnOn() {
        System.out.print("TV Remote: ");
        device.turnOn();
    }
    public void turnOff() {
        System.out.print("TV Remote: ");
        device.turnOff();
    }
}
