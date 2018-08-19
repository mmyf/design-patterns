package com.etudes.design.patterns.abstractFactory.impl;

import com.etudes.design.patterns.abstractFactory.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}
