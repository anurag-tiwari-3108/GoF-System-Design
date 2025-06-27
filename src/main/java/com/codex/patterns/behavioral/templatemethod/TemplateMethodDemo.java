package com.codex.patterns.behavioral.templatemethod;

// Layman Example: Preparing Beverages (Tea/Coffee)
public class TemplateMethodDemo {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecipe();
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
