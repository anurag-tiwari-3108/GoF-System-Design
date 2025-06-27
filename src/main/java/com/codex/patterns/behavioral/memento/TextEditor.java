package com.codex.patterns.behavioral.memento;

public class TextEditor {
    private String text = "";
    public void write(String words) { text += words; }
    public String getText() { return text; }
    public Memento save() { return new Memento(text); }
    public void restore(Memento memento) { text = memento.getText(); }
}
