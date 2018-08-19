package com.etudes.design.patterns.decorator.demo;

import com.etudes.design.patterns.decorator.Shape;
import com.etudes.design.patterns.decorator.impl.Circle;
import com.etudes.design.patterns.decorator.impl.Rectangle;
import com.etudes.design.patterns.decorator.impl.RedShapeDecorator;

public class DecoratorPatternDemo {
	public static void main(String[] args) {

		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}