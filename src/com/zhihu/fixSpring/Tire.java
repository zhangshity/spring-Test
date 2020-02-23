package com.zhihu.fixSpring;

public class Tire {//轮胎
	private int size;  //只有轮胎才有尺寸，私有，int类型的size属性

	Tire(int size1) {//构造函数
		this.size = size1;  //构造方法定义尺寸
	}
	
	/*public void outTire() {
		System.out.println(size);
	} */  //不知怎么输出tire的属性
}
