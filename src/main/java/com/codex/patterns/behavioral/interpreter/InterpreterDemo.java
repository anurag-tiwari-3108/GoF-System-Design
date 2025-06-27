package com.codex.patterns.behavioral.interpreter;

// Layman Example: Simple Math Expression Interpreter (1 + 2)
public class InterpreterDemo {
    public static void main(String[] args) {
        Expression one = new NumberExpression(1);
        Expression two = new NumberExpression(2);
        Expression plus = new AddExpression(one, two);
        System.out.println("1 + 2 = " + plus.interpret());
    }
}
