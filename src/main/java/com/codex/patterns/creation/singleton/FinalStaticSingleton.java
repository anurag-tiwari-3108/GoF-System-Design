package com.codex.patterns.creation.singleton;

public class FinalStaticSingleton {

	public final static FinalStaticSingleton INSTANCE = new FinalStaticSingleton();

	private FinalStaticSingleton() {
	}
}
