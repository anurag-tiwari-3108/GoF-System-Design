package com.codex.dp.structural.bridge;

public class BananaFeeder extends Feeding {
	public void peelFood() {
		System.out.println("Peeling banana");
	}

	public void crackOpen() {
		System.out.println("Whoops, squished it...");
	}
}