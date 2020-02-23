package com.zhihu.fixSpring;

public class Bottom {//底盘
	private Tire tire;  //底盘有轮胎，定义一个私有轮胎属性，Tire对象类型的属性tire

	Bottom(int size2){//构造函数
		this.tire=new Tire(size2);  //构造方法new一个新轮胎
	}
}
