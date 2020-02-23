package com.test.spring.aop_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCounterTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-counter.xml");
		//Counter counter = applicationContext.getBean(Counter.class);
		Counter counter = (Counter) applicationContext.getBean("counterImpl");

		int result = counter.avg(10, 20);
		System.out.println("平均值：" + result);

	}
}
