package com.demo.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext appctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person3 = (Person) appctx.getBean("person3");
		System.out.println(person3);
		
		NewPerson np=(NewPerson) appctx.getBean("newPerson");
		System.out.println(np);
		
		DataSource ds = (DataSource) appctx.getBean("dataSource");
		System.out.println(ds);
		
		Person person4 = (Person) appctx.getBean("person4");//可饮用的单例集合bean <util:list id="cars"> <ref bean="car2">
		System.out.println(person4);
		
		Person person5 = (Person) appctx.getBean("person5");//p命名空间<bean id="" class=""  p:name="" p:age=""></bean>
		System.out.println(person5);
 	}
}
