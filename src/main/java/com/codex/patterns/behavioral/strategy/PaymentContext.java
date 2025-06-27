package com.codex.patterns.behavioral.strategy;

public class PaymentContext {
    private PaymentStrategy strategy;
    public PaymentContext(PaymentStrategy strategy) { this.strategy = strategy; }
    public void setStrategy(PaymentStrategy strategy) { this.strategy = strategy; }
    public void pay(int amount) { strategy.pay(amount); }
}
