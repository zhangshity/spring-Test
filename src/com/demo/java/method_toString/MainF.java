package com.demo.java.method_toString;

public class MainF {
	public static void main(String[] args) {
		//初始化类对象
		Method_toString m = new Method_toString();
		// 调用toString方法，如果方法没有被重写，则默认返回内存地址，eclipse自动重写返回 [属性=值]
		System.out.println(m.toString());
		// sysout输出引用默认调用toString方法													
		System.out.println(m);
		/*
		 * 在Java中每个类都默认继承Object类，除非声明继承某个类。 而Object类中有一个叫做toString的方法。
		 * 该方法返回的是该Java对象的内存地址经过哈希算法得出的int类型的值在转换成十六进制。
		 *  这个输出的结果可以等同的看作Java对象在堆中的内存地址。
		 */
	}
}
