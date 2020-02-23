package com.zhihu.oldSpring;

public class Framework {// 车身框架
	private Bottom bottom;  //车身框架基于底盘，包含私有bottom属性，Bottom对象类型的属性bottom

	Framework() {//构造函数
		this.bottom = new Bottom();//构造方法定义一个底盘
	}
}
