package com.codex.patterns.structural.adapter;

// Layman Example: Mobile Charger Adapter
public class AdapterDemo {
    public static void main(String[] args) {
        EuropeanSocket europeanSocket = new EuropeanSocketImpl();
        USASocketAdapter usaAdapter = new USASocketAdapterImpl(europeanSocket);
        usaAdapter.powerUSADevice();
    }
}
