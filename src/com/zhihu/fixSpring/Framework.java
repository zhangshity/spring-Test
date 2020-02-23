package com.zhihu.fixSpring;

public class Framework {// 车身框架
	private Bottom bottom;  //车身框架基于底盘，包含私有bottom属性，Bottom对象类型的属性bottom

	Framework(int size3) {//构造函数
		this.bottom = new Bottom(size3);//构造方法定义一个底盘
	}
}
