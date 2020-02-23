package com.zhihu.oldSpring;

public class Car {// 车
	private Framework framework; // 车身包含框架，定义私有框架，Framework对象类型的属性framework

	Car() {// 构造函数
		this.framework = new Framework();
	}

	public void run() {
		// System.out.println(tir.size);
		/*
		 * 理解是在Car类创建时，所有下属类全部创建。
		 *  而每个类的属性类型均是private故无法访问，还待验证理解
		 */
		System.out.println("The car is running!");
	}
}
