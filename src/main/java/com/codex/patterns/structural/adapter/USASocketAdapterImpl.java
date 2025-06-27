package com.codex.patterns.structural.adapter;

public class USASocketAdapterImpl implements USASocketAdapter {
    private EuropeanSocket europeanSocket;
    public USASocketAdapterImpl(EuropeanSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }
    public void powerUSADevice() {
        System.out.println("Adapter converts 220V to 110V for USA device.");
        europeanSocket.powerWith220V();
    }
}
