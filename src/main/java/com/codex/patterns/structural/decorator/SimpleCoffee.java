package com.codex.patterns.structural.decorator;

public class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }
    public double getCost() {
        return 2.0;
    }
}
