package com.codex.patterns.behavioral.memento;

public class Caretaker {
    private Memento memento;
    public void save(TextEditor editor) { memento = editor.save(); }
    public void undo(TextEditor editor) { editor.restore(memento); }
}
