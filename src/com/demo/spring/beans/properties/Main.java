package com.demo.spring.beans.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws SQLException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-properties.xml");
		 
		 DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		 
		 System.out.println(dataSource.getConnection());
		 //暂时没有连接上数据库~!!!
	}
}
