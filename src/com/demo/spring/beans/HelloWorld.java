package com.demo.spring.beans;

public class HelloWorld {
	private String name;
	
	public HelloWorld() {//构造方法！默认存在可以不写,但是！！！bean的配置需要无参的构造函数
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {//set方法，设置name属性
		this.name = name;
	}

	public void hello() {//hello空返回方法，输出字符+属性
		System.out.println("hello:" + name);
	}

}
