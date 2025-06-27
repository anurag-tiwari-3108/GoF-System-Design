package com.codex.patterns.behavioral.templatemethod;

public class Tea extends Beverage {
    public void brew() { System.out.println("Steeping the tea"); }
    public void addCondiments() { System.out.println("Adding lemon"); }
}
