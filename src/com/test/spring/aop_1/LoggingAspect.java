package com.test.spring.aop_1;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.test.spring.aop_1.CounterImpl.avg(int,int))")
	public void BeforeMethod(JoinPoint joinPoint) {
		System.out.println("方法名："+joinPoint.getSignature().getName()+" 方法参数 :"+ Arrays.asList(joinPoint.getArgs()));
	}
}	
