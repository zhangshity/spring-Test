package com.demo.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean2 implements FactoryBean<Car> {

	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return  new Car("bmw",500000);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

}
