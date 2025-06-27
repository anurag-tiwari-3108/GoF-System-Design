package com.codex.patterns.structural.bridge;

public abstract class RemoteControl {
    protected Device device;
    public RemoteControl(Device device) {
        this.device = device;
    }
    public abstract void turnOn();
    public abstract void turnOff();
}
