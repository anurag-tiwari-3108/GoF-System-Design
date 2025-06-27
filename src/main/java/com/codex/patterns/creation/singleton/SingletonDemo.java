package com.codex.patterns.creation.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        EagerInitializedSingleton eager = EagerInitializedSingleton.getInstance();
        BillPughSingleton billPugh = BillPughSingleton.getInstance();
        DoublyCheckedSingleton doubleChecked = DoublyCheckedSingleton.getInstance();
        FinalStaticSingleton finalStatic = FinalStaticSingleton.INSTANCE;
        EnumSingletone enumSingleton = EnumSingletone.INSTANCE;
        ClonableSingleton cloneSingleton = ClonableSingleton.getInstance();
        SerializedSingleton serializedSingleton = SerializedSingleton.getInstance();
        StaticBlockSingletone staticBlock = StaticBlockSingletone.getInstance();

        System.out.println("EagerInitializedSingleton: " + eager.hashCode());
        System.out.println("BillPughSingleton: " + billPugh.hashCode());
        System.out.println("DoublyCheckedSingleton: " + doubleChecked.hashCode());
        System.out.println("FinalStaticSingleton: " + finalStatic.hashCode());
        System.out.println("EnumSingletone: " + enumSingleton.hashCode());
        System.out.println("ClonableSingleton: " + cloneSingleton.hashCode());
        System.out.println("SerializedSingleton: " + serializedSingleton.hashCode());
        System.out.println("StaticBlockSingletone: " + staticBlock.hashCode());
    }
}
