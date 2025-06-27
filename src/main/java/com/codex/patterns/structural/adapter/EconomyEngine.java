package com.codex.patterns.structural.adapter;

public class EconomyEngine extends Engine{

	public EconomyEngine() {
	    super( "Economy" );
	  }

	  public void start() {
	    System.out.println( "Started the " + name + " engine." );
	  }
	  public void stop() {
	    System.out.println( "Stopped the " + name + " engine." );
	  }
	  public void accelerate() {
	    System.out.println( "Speed increased by 2 mph." );
	  }
	  public void decelerate() {
	    System.out.println( "Speed decreased by 3 mph." );
	  }
}
