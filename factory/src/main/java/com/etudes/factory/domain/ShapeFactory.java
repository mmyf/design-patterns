package com.etudes.factory.domain;

import com.etudes.factory.Shape;
import com.etudes.factory.impl.Circle;
import com.etudes.factory.impl.Rectangle;
import com.etudes.factory.impl.Square;

public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}