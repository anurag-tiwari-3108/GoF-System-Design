package com.codex.patterns.behavioral.iterator;

public class NameRepository {
    public String[] names = {"John", "Jane", "Jack", "Jill"};
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator {
        int index;
        public boolean hasNext() {
            return index < names.length;
        }
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
