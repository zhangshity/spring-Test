package com.test.spring.ioc_1;

public class Student {
	public String name;
	public int id;
	public String gender;

	public Student() {//构造方法！默认存在可以不写,但是！！！bean的配置需要无参的构造函数
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {//set方法，设置name属性
		this.name = name;
	}

	public void setId(int id) {//set方法，设置id属性
		this.id = id;
	}

	public void setGender(String gender) {//set方法，设置gender属性
		this.gender = gender;
	}

	public void write() {//自定义空返回方法，输出字符
		System.out.println("这是一个Student类的对象的方法的检测，输出说明对象创建成功！方法调用成功");
	}
}
