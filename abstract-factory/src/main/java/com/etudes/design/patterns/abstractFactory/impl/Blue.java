package com.etudes.design.patterns.abstractFactory.impl;

import com.etudes.design.patterns.abstractFactory.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}
