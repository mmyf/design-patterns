package com.prototype.exemple1.impl;

import com.prototype.exemple1.Shape;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}