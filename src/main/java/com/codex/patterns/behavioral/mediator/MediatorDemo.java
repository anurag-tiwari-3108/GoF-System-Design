package com.codex.patterns.behavioral.mediator;

// Layman Example: Chat Room Mediator
public class MediatorDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);
        alice.send("Hi Bob!");
        bob.send("Hello Alice!");
    }
}
