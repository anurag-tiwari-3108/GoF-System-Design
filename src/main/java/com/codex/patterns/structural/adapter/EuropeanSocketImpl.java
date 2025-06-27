package com.codex.patterns.structural.adapter;

public class EuropeanSocketImpl implements EuropeanSocket {
    public void powerWith220V() {
        System.out.println("Powering with 220V (European standard)");
    }
}
