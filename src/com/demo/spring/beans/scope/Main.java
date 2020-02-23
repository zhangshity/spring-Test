package com.demo.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.beans.autowire.Address;
import com.demo.spring.beans.autowire.Car;
import com.demo.spring.beans.autowire.Person;

public class Main {
	public static void main(String[] args) {
		
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-scope.xml");
		Car car = (Car) applicationContext.getBean("car");
		Car car2 = (Car) applicationContext.getBean("car");
		System.out.println(car == car2);
		                                /*同时在scope的bean中引用的
										class="com.demo.spring.beans.autowire.Car"的类中
										重写构造函数，sysout打印一段话，验证被创建几个
		                                */
		
		
		/*==============================================================================
		 * scope="prototype"  原型的，结果：This Car's constructor!
		 *								   This Car's constructor!
		 *								   false，
		 *					    每次从容器获取bean，都会产生新的bean
		 *					  //在IOC容器创建时，还没有创建bean实例(利用构造函数验证)
		 *					  //每次从容器中getBean时才创建bean实例，每次拿取时创建的bean不同
		 *-----------------------------------------------------------------------------
		 * scope="request" 
		 *-----------------------------------------------------------------------------
		 * scope="session" 
		 *-----------------------------------------------------------------------------
		 * scope="singleton" 单例模式(默认模式)，结果：This Car's constructor!
		 *											true
		 *					   容器创建bean实例，在整个容器的生命周期中 ，只有一个bean。
		 *                   //其实在IOC容器创建好的过程中bean就创建好了(利用构造函数验证)
		 * ==============================================================================
		 * */
	}
}
