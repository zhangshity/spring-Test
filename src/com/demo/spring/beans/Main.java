package com.demo.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		/*// 创建HelloWord的一个对象
		HelloWorld hw = new HelloWorld();
		// 为name赋值
		hw.setName("ZCYcreate");*/

		// 1.创建Spring的 IOC 容器对象
		ApplicationContext appctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * AppplicationContext代表Spring里的IOC容器，是一个接口
		 * ClassPathXmlApplicationContext是配置文件在类路径下，是ApplicationContext的实现类，
		 * 参数传入的为配置文件的名字
		 */

		// 2.从 IOC 容器中获取Bean实例
		HelloWorld hw = (HelloWorld)appctx.getBean("helloWorld");
		// 3.调用hello方法
		

		// 调用HelloWorld方法
		hw.hello();
		//属性注入
		Car car = (Car) appctx.getBean("car");
		System.out.println(car);
		//构造方法注入
		Car car2 = (Car) appctx.getBean("car2");
		System.out.println(car2);
		
		//属性注入，person 和 car 两个bean的引用关系(1.ref 2.内部Bean)
		Person person = (Person) appctx.getBean("person");
		System.out.println(person);
		
		//构造方法注入,person 和 car 两个bean的引用关系(1.ref 2.内部Bean)
		Person person2 = (Person) appctx.getBean("person2");
		System.out.println(person2);
		
		Car carByName = (Car) appctx.getBean("carByName");
		System.out.println(carByName);
		
	}
}
