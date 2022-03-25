package com.codex.dp.creation.singleton;

public class ClonableSingleton implements Cloneable{
	private static ClonableSingleton instance = new ClonableSingleton();
	private ClonableSingleton() {
	}
	
	public static ClonableSingleton getInstance() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {		
		return getInstance();
	}
	

}
