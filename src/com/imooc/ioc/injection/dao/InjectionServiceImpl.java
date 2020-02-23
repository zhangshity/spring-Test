package com.imooc.ioc.injection.dao;

public class InjectionServiceImpl {
	
	
	private InjectionDAO injectionDAO;
	//设值注入
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public void save(String arg) {
		// 模拟业务操作
		System.out.println("Service接收参数：" + arg);
		arg= arg+":"+this.hashCode();
		injectionDAO.save(arg);
	}
}
