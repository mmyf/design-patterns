package com.etudes.design.patterns.builder.service.impl;

import com.etudes.design.patterns.builder.service.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}
}
