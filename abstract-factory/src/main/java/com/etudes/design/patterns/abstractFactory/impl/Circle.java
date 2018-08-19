package com.etudes.design.patterns.abstractFactory.impl;

import com.etudes.design.patterns.abstractFactory.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
