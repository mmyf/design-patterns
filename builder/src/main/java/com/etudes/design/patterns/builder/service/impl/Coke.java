package com.etudes.design.patterns.builder.service.impl;

import com.etudes.design.patterns.builder.service.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}
}
