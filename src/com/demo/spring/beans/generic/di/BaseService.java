package com.demo.spring.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	
	@Autowired
	protected BaseRepository<T> repository;
	
	public void add() {
		System.out.println(" baseRepository add()......");
		System.out.println(repository);
	}
}
