package com.etudes.design.patterns.decorator.impl;

import com.etudes.design.patterns.decorator.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}