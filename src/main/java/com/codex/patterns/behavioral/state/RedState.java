package com.codex.patterns.behavioral.state;

public class RedState implements State {
    public void handle(TrafficLight light) {
        System.out.println("Red Light - Stop");
        light.setState(new GreenState());
    }
}
