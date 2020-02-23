package com.imooc.ioc.injection.dao;

public class InjectionDAOImp implements InjectionDAO {
	public void save(String arg) {
		//模拟数据库操作
		System.out.println("保存数据："+arg);
	}
}
