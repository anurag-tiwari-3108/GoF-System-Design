package com.codex.patterns.behavioral.chainofresponsibility;

public class Level2Support extends SupportHandler {
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("software install")) {
            System.out.println("Level 2 handled: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
