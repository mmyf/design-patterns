package com.etudes.design.patterns.builder.impl;

import com.etudes.design.patterns.builder.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}
}