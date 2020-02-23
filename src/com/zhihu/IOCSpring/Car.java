package com.zhihu.IOCSpring;

public class Car {
	private Framework framework;

	Car(Framework framework) {
		this.framework = framework;
	}
	public void run() {
		System.out.println("IOC依赖注入实现");
	}
}
