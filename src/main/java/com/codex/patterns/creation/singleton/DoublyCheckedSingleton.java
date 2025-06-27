package com.codex.patterns.creation.singleton;

public class DoublyCheckedSingleton {
	volatile static DoublyCheckedSingleton instance = null;

	private DoublyCheckedSingleton() {
	}

	public static DoublyCheckedSingleton getInstance() {
		if (instance == null) {
			synchronized (DoublyCheckedSingleton.class) {
				if (instance == null) {
					instance = new DoublyCheckedSingleton();
				}

			}
		}
		return instance;
	}

}
