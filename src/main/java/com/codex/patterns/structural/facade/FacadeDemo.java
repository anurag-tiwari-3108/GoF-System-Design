package com.codex.patterns.structural.facade;

// Layman Example: Home Theater Facade
public class FacadeDemo {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new DVDPlayer(), new Projector(), new SoundSystem());
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
