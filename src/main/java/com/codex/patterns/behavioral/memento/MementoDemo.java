package com.codex.patterns.behavioral.memento;

// Layman Example: Text Editor Undo Feature
public class MementoDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();
        editor.write("Hello");
        caretaker.save(editor);
        editor.write(" World");
        System.out.println(editor.getText());
        caretaker.undo(editor);
        System.out.println(editor.getText());
    }
}
