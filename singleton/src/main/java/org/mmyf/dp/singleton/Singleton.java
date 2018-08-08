package org.mmyf.dp.singleton;

import org.mmyf.dp.singleton.entity.ClassA;

public class Singleton {
	private static ClassA classA = null;
	
	public static ClassA getClassA(){
		if(classA==null){
			classA = new ClassA();			
		}
		return classA;
	}
}
