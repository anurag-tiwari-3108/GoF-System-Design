package com.codex.patterns.structural.composite;

public class File implements FileSystemComponent {
    private String name;
    public File(String name) { this.name = name; }
    public void ls(String indent) {
        System.out.println(indent + "- " + name);
    }
}
