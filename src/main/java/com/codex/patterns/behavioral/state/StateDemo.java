package com.codex.patterns.behavioral.state;

// Layman Example: Traffic Light State
public class StateDemo {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        light.change(); // Red to Green
        light.change(); // Green to Yellow
        light.change(); // Yellow to Red
    }
}
