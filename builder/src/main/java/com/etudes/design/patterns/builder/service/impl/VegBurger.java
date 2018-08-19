package com.etudes.design.patterns.builder.service.impl;

import com.etudes.design.patterns.builder.service.Burger;

public class VegBurger extends Burger {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}
}
