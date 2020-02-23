package com.demo.spring.aop.proxy;

import org.springframework.cglib.core.MethodWrapper;

public class Main {
	public static void main(String[] args) {
//		Calculator calculator =new CalculatorImpl();
//		System.out.println("10+5:" + calculator.add(10, 5) + "\n10-5:" + calculator.sub(10, 5) + "\n10*5:"
//				+ calculator.mul(10, 5) + "\n10/5:"+calculator.div(10, 5));
		
		/*Calculator target = new CalculatorImpl();
		Calculator proxy= new CalculatorLoggingProxy(target).getLoggingProxy();
		
		System.out.println("10+5:" + calculator.add(10, 5) + "\n10-5:" + calculator.sub(10, 5) + "\n10*5:"
				+ calculator.mul(10, 5) + "\n10/5:"+calculator.div(10, 5));*/
	
	
		//Calculator calculator = new CalculatorImpl();
		Calculator calculator = new CalculatorImpl();
		Calculator proxy = new CalculatorLoggingProxy(calculator).getloggingProxy();
		
		int result = proxy.add(1, 2);
		System.out.println(result);
		
		 result = proxy.div(4, 2);
		System.out.println(result);
	
		//AOP
		System.out.println(proxy.getClass().getName());
	
	
	
	}
}
