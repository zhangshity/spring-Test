package com.demo.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserJdbcRepository implements UserRepository {

	@Override
	public void save() {
		System.out.println("UserJdbcRepository save().....");
	}
		
}
