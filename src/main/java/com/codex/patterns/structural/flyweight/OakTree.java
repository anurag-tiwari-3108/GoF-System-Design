package com.codex.patterns.structural.flyweight;

public class OakTree implements Tree {
    public void display(int x, int y) {
        System.out.println("Oak tree at (" + x + ", " + y + ")");
    }
}
