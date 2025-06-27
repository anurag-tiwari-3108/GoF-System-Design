package com.codex.patterns.structural.proxy;

public class RealInternet implements Internet {
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to " + serverHost);
    }
}
