package com.codex.patterns.behavioral.strategy;

// Layman Example: Payment Strategy (Credit Card, PayPal)
public class StrategyDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.pay(100);
        context.setStrategy(new PayPalPayment());
        context.pay(200);
    }
}
