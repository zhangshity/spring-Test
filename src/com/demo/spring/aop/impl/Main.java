package com.demo.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// 1.创建 spring 的 IOC 容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-impl.xml");

		// 2.从 IOC 容器中获取获取 bean 的实例
		//Calculator calculator = (Calculator)applicationContext.getBean("calculatorImpl");
		Calculator calculator = (Calculator) applicationContext.getBean(Calculator.class);

		// 3.使用 bean
		int result = calculator.add(3, 6);
		System.out.println("结果：" + result);
		
		 //result = calculator.div(10, 1); //注解里只加了 Add 方法，div方法不受AOP影响
		//System.out.println("结果：" + result);
	}
}
