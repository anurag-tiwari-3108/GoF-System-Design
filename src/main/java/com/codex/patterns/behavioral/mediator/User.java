package com.codex.patterns.behavioral.mediator;

public class User {
    private String name;
    private ChatRoom chatRoom;
    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }
    public void send(String message) {
        chatRoom.showMessage(name, message);
    }
}
