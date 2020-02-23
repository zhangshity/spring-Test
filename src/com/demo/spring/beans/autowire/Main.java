package com.demo.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-autowire.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
//		Address address = (Address) applicationContext.getBean("address");
//		System.out.println(address.toString());
//		Car car = (Car) applicationContext.getBean("car");
//		System.out.println(car);
		
	}
}
