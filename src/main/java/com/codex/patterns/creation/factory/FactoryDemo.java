package com.codex.patterns.creation.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        Shape rectangle = ShapeFactory.getShape("rectangle");
        if (circle != null) circle.draw();
        if (rectangle != null) rectangle.draw();
    }
}
