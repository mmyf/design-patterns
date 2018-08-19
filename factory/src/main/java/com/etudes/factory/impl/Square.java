package com.etudes.factory.impl;

import com.etudes.factory.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
