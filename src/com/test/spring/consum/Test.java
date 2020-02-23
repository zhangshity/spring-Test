package com.test.spring.consum;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@org.junit.jupiter.api.Test
	void test() {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("consum.xml");
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student);
	}

}
