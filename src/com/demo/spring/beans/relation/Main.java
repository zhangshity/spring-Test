package com.demo.spring.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.beans.autowire.Address;
import com.demo.spring.beans.autowire.Person;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-relation.xml");
		
		Address address = (Address) applicationContext.getBean("address");
		System.out.println(address);
		
		Address address2 = (Address) applicationContext.getBean("address2");
		System.out.println(address2);
		
		Address address3 = (Address) applicationContext.getBean("address3");
		System.out.println(address3);

		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
	}
}
