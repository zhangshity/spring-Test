package com.zhihu.IOCSpring_final;

public class IOCmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Car car = new Car(framework); 
		 * Framework framework = new Framework(bottom); 
		 * Bottom bottom = new Bottom(tire);
		 * Tire tire = new Tire();
		 * 顺序写反不可以，依赖关系
		 */
		int size = 30;
		
		Tire tire = new Tire(size);
		Bottom bottom = new Bottom(tire);
		Framework framework = new Framework(bottom);
		Car car = new Car(framework);
		car.run();
		tire.outTire();//可以实现对底层的输出，没有IOC不可以
	    
	}

}
