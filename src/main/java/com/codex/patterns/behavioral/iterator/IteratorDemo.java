package com.codex.patterns.behavioral.iterator;

// Layman Example: Name Collection Iterator
public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository names = new NameRepository();
        Iterator it = names.getIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
