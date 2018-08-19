package com.etudes.design.patterns.abstractFactory.impl;

import com.etudes.design.patterns.abstractFactory.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
