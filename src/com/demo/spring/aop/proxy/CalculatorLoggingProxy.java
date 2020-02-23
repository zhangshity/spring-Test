package com.demo.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//动态代理
public class CalculatorLoggingProxy {

	public CalculatorLoggingProxy(Calculator target) {// 构造函数传入要代理的对象引用
		this.target = target;
	}

	// 要代理的对象
	private Calculator target;

	public Calculator getloggingProxy() {
		Calculator proxy = null;

		// 代理对象由哪个类加载器负责加载
		ClassLoader loader = target.getClass().getClassLoader();
		// 代理对象的类型，即其中有哪些方法
		Class[] interfaces = new Class[] { Calculator.class };
		// 当调用代理对象其中的方法时，该执行的代码
		InvocationHandler h = new InvocationHandler() {
			/**
			 * proxy：正在返回的代理对象，一般情况下，在invoke方法中都不使用该对象 
			 * method:正在被调用的方法 args：调用方法时，传入的参数
			 *
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				String methodname = method.getName();
				// 日志
				System.out.println("The method " + methodname + " begin with " + Arrays.asList(args));
				// 执行方法
				Object result = method.invoke(target, args);
				//日志
				System.out.println("The method "+methodname+" ends with "+result);
				return result;
			}
		};

		proxy = (Calculator) Proxy.newProxyInstance(loader, interfaces, h);

		return proxy;
	}

}
