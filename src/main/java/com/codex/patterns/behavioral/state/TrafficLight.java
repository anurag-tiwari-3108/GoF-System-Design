package com.codex.patterns.behavioral.state;

public class TrafficLight {
    private State state = new RedState();
    public void setState(State state) { this.state = state; }
    public void change() { state.handle(this); }
}
