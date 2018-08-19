package com.etudes.design.patterns.abstractFactory.factory;

import com.etudes.design.patterns.abstractFactory.Color;
import com.etudes.design.patterns.abstractFactory.Shape;
import com.etudes.design.patterns.abstractFactory.abstractFactory.AbstractFactory;
import com.etudes.design.patterns.abstractFactory.impl.Blue;
import com.etudes.design.patterns.abstractFactory.impl.Green;
import com.etudes.design.patterns.abstractFactory.impl.Red;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}
}