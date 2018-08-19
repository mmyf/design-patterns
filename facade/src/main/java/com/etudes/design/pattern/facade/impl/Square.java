package com.etudes.design.pattern.facade.impl;

import com.etudes.design.pattern.facade.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}
}