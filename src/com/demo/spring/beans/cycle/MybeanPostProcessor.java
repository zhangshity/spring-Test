package com.demo.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MybeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization" + bean + "," + beanName);
		// return BeanPostProcessor.super.postProcessBeforeInitialization(bean,
		// beanName);

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization" + bean + "," + beanName);
		// return BeanPostProcessor.super.postProcessAfterInitialization(bean,
		// beanName);

		return bean;
	}
	
	//结果：
	
	// car' constructor
	// setBrand...
	// postProcessBeforeInitializationcom.demo.spring.beans.cycle.Car@59494225,car
	// init...
	// postProcessAfterInitializationcom.demo.spring.beans.cycle.Car@59494225,car
	// com.demo.spring.beans.cycle.Car@59494225
	
	// 三月 30, 2018 3:19:32 下午
	// org.springframework.context.support.ClassPathXmlApplicationContext doClose
	// 信息: Closing
	// org.springframework.context.support.ClassPathXmlApplicationContext@2957fcb0:
	// startup date [Fri Mar 30 15:19:32 CST 2018]; root of context hierarchy
	
	// destroy...
}
