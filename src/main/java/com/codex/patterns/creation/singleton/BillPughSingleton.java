package com.codex.patterns.creation.singleton;

/**
 * Prior to Java 5, java memory model had a lot of issues and the above
 * approaches used to fail in certain scenarios where too many threads try to
 * get the instance of the Singleton class simultaneously. So Bill Pugh came up
 * with a different approach to create the Singleton class using an inner static
 * helper class. The Bill Pugh Singleton implementation goes like this;
 * 
 * @author anutiwar
 *
 */
public class BillPughSingleton {

	private BillPughSingleton() {

	}

	private static class SingletoneHelper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletoneHelper.instance;
	}
	// Notice the private inner static class that contains the instance of the
	// singleton class When the singleton class is loaded, SingletonHelper class is
	// not loaded into memory and only when someone calls the getInstance method,
	// this class gets loaded and creates the Singleton class instance.
}
