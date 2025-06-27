package com.codex.patterns.behavioral.chainofresponsibility;

public class Level1Support extends SupportHandler {
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("password reset")) {
            System.out.println("Level 1 handled: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
