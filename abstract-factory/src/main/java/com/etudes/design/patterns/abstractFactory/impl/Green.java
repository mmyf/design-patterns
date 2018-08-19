package com.etudes.design.patterns.abstractFactory.impl;

import com.etudes.design.patterns.abstractFactory.Color;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
}
