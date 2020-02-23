package com.demo.spring.beans.SpEL;

public class Person {
	private String name;
	
	private Car car;
	
	private String city;//引用Address bean 的 city 属性
	
	private String info;//根据的Car的price确定info ：car的price >=30W为金领，否则为白领

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", city=" + city + ", info=" + info + "]";
	}



}
