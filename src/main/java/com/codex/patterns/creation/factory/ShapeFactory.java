package com.codex.patterns.creation.factory;

public class ShapeFactory {
	String a = new String();
	
	public static Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		else if(shapeType.equalsIgnoreCase("circle")){
			return new CircleShape();
		}
		else if(shapeType.equalsIgnoreCase("rectangle")){
			return new RectangleShape();
		}
		return null;
	}
	

}
