package com.codex.patterns.behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    public int visit(Book book) {
        System.out.println("Book: " + book.getName() + " costs $" + book.getPrice());
        return book.getPrice();
    }
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getWeight() + "kg of " + fruit.getName() + " costs $" + cost);
        return cost;
    }
}
