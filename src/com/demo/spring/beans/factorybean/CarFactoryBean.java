package com.demo.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;


/**
 * @author Yang
 * 自定义的FactoryBean 需要实现Spring提供的几口FactoryBean
 */
public class CarFactoryBean implements FactoryBean<Car> {
	
	
	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//返回bean的对象
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand,500000);
	}

	//返回bean的类型
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		//return FactoryBean.super.isSingleton();
		return true;
	}
}
