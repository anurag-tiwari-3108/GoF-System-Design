package com.codex.patterns.behavioral.state;

public class GreenState implements State {
    public void handle(TrafficLight light) {
        System.out.println("Green Light - Go");
        light.setState(new YellowState());
    }
}
