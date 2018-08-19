package com.etudes.design.patterns.abstractFactory.abstractFactory;

import com.etudes.design.patterns.abstractFactory.Color;
import com.etudes.design.patterns.abstractFactory.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}
