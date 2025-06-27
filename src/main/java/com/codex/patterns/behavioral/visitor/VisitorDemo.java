package com.codex.patterns.behavioral.visitor;

// Layman Example: Shopping Cart Visitor
public class VisitorDemo {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
            new Book(20, "Design Patterns Book"),
            new Fruit(10, 2, "Apple")
        };
        int total = calculatePrice(items);
        System.out.println("Total Cost = $" + total);
    }
    public static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum += item.accept(visitor);
        }
        return sum;
    }
}
