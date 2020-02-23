package com.test.spring.aop_1;

import org.springframework.stereotype.Component;

@Component
public class CounterImpl implements Counter {

	@Override
	public int avg(int i, int j) {
		return (i + j) / 2;
	}

}
