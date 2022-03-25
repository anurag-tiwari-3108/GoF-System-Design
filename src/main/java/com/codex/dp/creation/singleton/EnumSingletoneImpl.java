package com.codex.dp.creation.singleton;

public class EnumSingletoneImpl {

	public static void main(String[] args) {
		EnumSingletone obj = EnumSingletone.INSTANCE;
		System.out.println(obj.getValue());
		obj.setValue(2);
		System.out.println(obj.getValue());
	}

}
