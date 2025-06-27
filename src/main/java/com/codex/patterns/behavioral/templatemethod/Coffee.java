package com.codex.patterns.behavioral.templatemethod;

public class Coffee extends Beverage {
    public void brew() { System.out.println("Dripping coffee through filter"); }
    public void addCondiments() { System.out.println("Adding sugar and milk"); }
}
