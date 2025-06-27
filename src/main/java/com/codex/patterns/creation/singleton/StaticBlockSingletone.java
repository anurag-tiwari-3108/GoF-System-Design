package com.codex.patterns.creation.singleton;

public class StaticBlockSingletone {

	private static StaticBlockSingletone instance;

	private StaticBlockSingletone() {

	}

	static {
		try {
			instance = new StaticBlockSingletone();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingletone getInstance() {
		return instance;
	}
}
