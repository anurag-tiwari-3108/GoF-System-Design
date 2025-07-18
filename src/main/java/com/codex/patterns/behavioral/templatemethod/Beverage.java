package com.codex.patterns.behavioral.templatemethod;

public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public void boilWater() { System.out.println("Boiling water"); }
    public void pourInCup() { System.out.println("Pouring into cup"); }
    public abstract void brew();
    public abstract void addCondiments();
}
