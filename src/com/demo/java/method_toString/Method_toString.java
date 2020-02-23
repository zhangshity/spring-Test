package com.demo.java.method_toString;

public class Method_toString {
	public String name;
	public int age;
	public String gender;
	
	//默认 toString() 方法
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}*/
	
	//eclipse自动重写的的 toString() 方法
	@Override
	public String toString() {
		return "Method_toString [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}
