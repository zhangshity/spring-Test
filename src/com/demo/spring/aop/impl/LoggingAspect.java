package com.demo.spring.aop.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.patterns.Declare;
import org.springframework.stereotype.Component;

import com.mysql.fabric.xmlrpc.base.Array;

//把这个类声明为一个切面：1.首先需要把该类放入 IOC 容器中 2在声明一个切面
@Aspect
@Component
public class LoggingAspect {
	/**
	 * 定义一个方法，用于声明切入点表达式,
	 * 一般的该方法中不需要在添加其他代码。
	 * 使用Pointcut 来声明切入点表达式
	 * 后面的表达式，直接引用方法名来引用
	 */
	@Pointcut("execution(public int com.demo.spring.aop.impl.CalculatorImpl.add(int, int))")
	public void declareJoinPointExpression() {
		
	}
	
	
	
	// 声明：该方法是一个前置通知，即在目标方法开始之前执行
	@Before("execution(public int com.demo.spring.aop.impl.CalculatorImpl.add(int, int))")
	public void beforeMethod(JoinPoint joinpoint) {
		String methodName = joinpoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinpoint.getArgs());
		System.out.println("The Method " + methodName + " begins with" + args);
	}

	// 后置通知：在目标方法执行后(无论是否发生异常)，执行通知
	// 在后置通知中，不能访问目标方法的的执行结果
	@After("declareJoinPointExpression()")
	public void afterMethod(JoinPoint joinpoint) {
		String methodName = joinpoint.getSignature().getName();
		System.out.println("The Method " + methodName + " ends");
	}
	

	// 返回通知：在代码正常执行过后执行的代码，所以可以访问方法的返回值
	@AfterReturning(value = "execution(public int com.demo.spring.aop.impl.CalculatorImpl.add(int, int))", returning = "result")
	public void afterReturning(JoinPoint joinpoint, Object result) {
		String methodName = joinpoint.getSignature().getName();
		System.out.println("The Method " + methodName + " ends with " + result);
	}
	
	
	//异常通知：在目标方法出现异常时会执行的代码，
	//         可以访问到异常对象;且可以指定在出现特定异常时再执行异常通知	
	@AfterThrowing(value = "execution(public int com.demo.spring.aop.impl.CalculatorImpl.*(int, int))", throwing = "ex")
	public void afterThrowing(JoinPoint joinpoint,Exception ex) {
		String methodName = joinpoint.getSignature().getName();
		System.out.println("The Method " + methodName + " occurs excetion " + ex);
	}
	
	
	//环绕通知：需要携带ProceedingJoinPoint类型的通知
	//          类似于动态代理的全过程：ProceedingJoinPoint类型的参数，可以决定是否执行目标方法
	//          且环绕通知必须有返回值
	@Around("execution(public int com.demo.spring.aop.impl.CalculatorImpl.*(int, int))")
	public Object aroundMethod(ProceedingJoinPoint pjd) {
		Object result = null;
		String methodName = pjd.getSignature().getName();
		
		try {
			//前置通知
			System.out.println("The method "+methodName +"begins with "+Arrays.asList(pjd.getArgs()));
			//执行目标方法
			result = pjd.proceed();
			//后置通知
			System.out.println("The method "+methodName +"ends with "+result);
		} catch (Throwable e) {
			//异常通知
			System.out.println("The method "+methodName +"occurs excption "+e);
			throw new RuntimeException(e);
		}
		//后置通知
		System.out.println("The method "+methodName +"ends");
		
		return result;
	}

}
