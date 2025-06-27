package com.codex.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();
    public Folder(String name) { this.name = name; }
    public void add(FileSystemComponent component) { children.add(component); }
    public void ls(String indent) {
        System.out.println(indent + "+ " + name);
        for (FileSystemComponent c : children) {
            c.ls(indent + "  ");
        }
    }
}
