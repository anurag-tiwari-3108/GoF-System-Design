package com.codex.patterns.behavioral.state;

public class YellowState implements State {
    public void handle(TrafficLight light) {
        System.out.println("Yellow Light - Caution");
        light.setState(new RedState());
    }
}
