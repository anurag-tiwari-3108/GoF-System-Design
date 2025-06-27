package com.codex.patterns.structural.bridge;

public class RadioRemote extends RemoteControl {
    public RadioRemote(Device device) {
        super(device);
    }
    public void turnOn() {
        System.out.print("Radio Remote: ");
        device.turnOn();
    }
    public void turnOff() {
        System.out.print("Radio Remote: ");
        device.turnOff();
    }
}
