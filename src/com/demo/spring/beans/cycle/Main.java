package com.demo.spring.beans.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-cycle.xml");
		
		Car car =(Car) applicationContext.getBean("car");
		System.out.println(car);
		
		
		//关闭IOC容器
		applicationContext.close();
		
	}
}	
	