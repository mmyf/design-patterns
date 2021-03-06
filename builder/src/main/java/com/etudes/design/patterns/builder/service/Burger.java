package com.etudes.design.patterns.builder.service;

import com.etudes.design.patterns.builder.Item;
import com.etudes.design.patterns.builder.Packing;
import com.etudes.design.patterns.builder.impl.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
