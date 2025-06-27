package com.codex.patterns.structural.flyweight;

// Layman Example: Tree objects in a forest (sharing common data)
public class FlyweightDemo {
    public static void main(String[] args) {
        TreeFactory factory = new TreeFactory();
        for (int i = 0; i < 3; i++) {
            Tree oak = factory.getTree("Oak");
            oak.display(i, i+1);
        }
        for (int i = 0; i < 2; i++) {
            Tree pine = factory.getTree("Pine");
            pine.display(i+10, i+11);
        }
    }
}
