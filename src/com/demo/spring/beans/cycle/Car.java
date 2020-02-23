package com.demo.spring.beans.cycle;

public class Car {

	private String brand;// 汽车品牌

	public Car() {// 构造函数
		// TODO Auto-generated constructor stub
		System.out.println("car' constructor");
	}

	public void setBrand(String brand) {// set方法，输出"setBrand"
		System.out.println("setBrand...");
		this.brand = brand;
	}

	public void init() {// 自定义方法，用于初始化IOC容器
		System.out.println("init...");
	}

	public void destroy() {// 自定义方法，用于关闭IOC容器
		System.out.println("destroy... ");
	}

	/*
	 * 运行结果：
	 * 运行时，bean生命周期，init和destroy为bean方法指定的初始化和销毁bean的方法
	 * 
	 * car' constructor     //构造函数
	 * setBrand...          //set方法    
	 * init... 				//初始化
	 * com.demo.spring.beans.cycle.Car@49993335   // 返回bean实例
	 * 
	 * destroy...			//销毁bean
	 */

}
