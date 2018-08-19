package com.etudes.design.patterns.builder.service;

import com.etudes.design.patterns.builder.Item;
import com.etudes.design.patterns.builder.Packing;
import com.etudes.design.patterns.builder.impl.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}