package com.codex.patterns.creation.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

	// To Overcome from serilization-deserilization object creation
	protected Object readResolve() {
		return getInstance();
	}
}