package com.etudes.design.patterns.abstractFactory.factory;

import com.etudes.design.patterns.abstractFactory.Color;
import com.etudes.design.patterns.abstractFactory.Shape;
import com.etudes.design.patterns.abstractFactory.abstractFactory.AbstractFactory;
import com.etudes.design.patterns.abstractFactory.impl.Circle;
import com.etudes.design.patterns.abstractFactory.impl.Rectangle;
import com.etudes.design.patterns.abstractFactory.impl.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
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

	@Override
	public Color getColor(String color) {
		return null;
	}
}
