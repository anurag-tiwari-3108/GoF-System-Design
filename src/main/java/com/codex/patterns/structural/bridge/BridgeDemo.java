package com.codex.patterns.structural.bridge;

// Layman Example: Remote controls for different devices
public class BridgeDemo {
    public static void main(String[] args) {
        RemoteControl tvRemote = new TVRemote(new TV());
        tvRemote.turnOn();
        tvRemote.turnOff();

        RemoteControl radioRemote = new RadioRemote(new Radio());
        radioRemote.turnOn();
        radioRemote.turnOff();
    }
}
