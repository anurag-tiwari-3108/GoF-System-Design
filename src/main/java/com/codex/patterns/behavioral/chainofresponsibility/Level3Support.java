package com.codex.patterns.behavioral.chainofresponsibility;

public class Level3Support extends SupportHandler {
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("network issue")) {
            System.out.println("Level 3 handled: " + request);
        } else {
            System.out.println("Request not handled: " + request);
        }
    }
}
