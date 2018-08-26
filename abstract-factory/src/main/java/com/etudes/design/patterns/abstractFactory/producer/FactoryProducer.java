package com.etudes.design.patterns.abstractFactory.producer;

import com.etudes.design.patterns.abstractFactory.abstractFactory.AbstractFactory;
import com.etudes.design.patterns.abstractFactory.factory.ColorFactory;
import com.etudes.design.patterns.abstractFactory.factory.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice != null) {
			if (choice.equalsIgnoreCase("SHAPE")) {
				return new ShapeFactory();

			} else if (choice.equalsIgnoreCase("COLOR")) {
				return new ColorFactory();
			
			} else {
				return null;				
			}			

		} else {
			return null;
		}
	}
}
