package com.codex.patterns.structural.flyweight;

public class PineTree implements Tree {
    public void display(int x, int y) {
        System.out.println("Pine tree at (" + x + ", " + y + ")");
    }
}
