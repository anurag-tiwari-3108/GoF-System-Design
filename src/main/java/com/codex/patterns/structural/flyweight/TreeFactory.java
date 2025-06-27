package com.codex.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private Map<String, Tree> treeMap = new HashMap<>();
    public Tree getTree(String type) {
        Tree tree = treeMap.get(type);
        if (tree == null) {
            if (type.equalsIgnoreCase("Oak")) {
                tree = new OakTree();
            } else if (type.equalsIgnoreCase("Pine")) {
                tree = new PineTree();
            }
            treeMap.put(type, tree);
        }
        return tree;
    }
}
