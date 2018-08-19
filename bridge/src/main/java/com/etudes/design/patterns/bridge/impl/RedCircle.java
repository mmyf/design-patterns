package com.etudes.design.patterns.bridge.impl;

import com.etudes.design.patterns.bridge.DrawAPI;

public class RedCircle implements DrawAPI {
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}