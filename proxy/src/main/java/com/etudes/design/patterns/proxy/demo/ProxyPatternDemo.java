package com.etudes.design.patterns.proxy.demo;

import com.etudes.design.patterns.proxy.Image;
import com.etudes.design.patterns.proxy.impl.ProxyImage;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}