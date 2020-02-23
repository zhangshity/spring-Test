package com.demo.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.demo.spring.beans.annotation.controller.UserController;
import com.demo.spring.beans.annotation.repository.UserRepository;
import com.demo.spring.beans.annotation.service.UserService;

public class Main {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
//		TestObject to = (TestObject) applicationContext.getBean("testObject");
//		System.out.println(to);
		
		UserController userController = (UserController) applicationContext.getBean("userController");
		System.out.println(userController);
		userController.excute();
		
//		UserRepository userRepository = (UserRepository) applicationContext.getBean("userRepositoryImpl");
//		System.out.println(userRepository);
//		
//		UserService userService= (UserService) applicationContext.getBean("userService");
//		System.out.println(userService);
//		
		
	}
}
