package com.zhihu.IOCSpring;

public class IOCmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Car c = new Car(f); 
		 * Framework f = new Framework(b); 
		 * Bottom b = new Bottom(t);
		 * Tire t = new Tire();
		 * 顺序写反不可以，依赖关系
		 */
		
		Tire t = new Tire();
		Bottom b = new Bottom(t);
		Framework f = new Framework(b);
		Car c = new Car(f);
		c.run();
	}

}
