package com.etudes.design.patterns.builder.impl;

import com.etudes.design.patterns.builder.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}
}
