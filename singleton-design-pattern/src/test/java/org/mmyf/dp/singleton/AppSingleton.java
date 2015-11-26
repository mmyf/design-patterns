package org.mmyf.dp.singleton;

import org.mmyf.dp.singleton.entity.ClassA;

public class AppSingleton {
	public static void main(String[] args) {
		ClassA c1 = Singleton.getClassA();
		ClassA c2 = Singleton.getClassA();
		ClassA c3 = Singleton.getClassA();
		ClassA c4 = Singleton.getClassA();
		ClassA c5 = Singleton.getClassA();
	}
}
