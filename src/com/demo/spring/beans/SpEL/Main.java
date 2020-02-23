package com.demo.spring.beans.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-SpEL.xml");
		
		Address address = (Address) applicationContext.getBean("address");
		System.out.println(address);
		
		Car car= (Car) applicationContext.getBean("car");
		System.out.println(car);
		
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
	}
}
