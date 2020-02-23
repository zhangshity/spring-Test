package com.test.spring.ioc_1;

import java.util.jar.Attributes.Name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Main {
	public static void main(String[] args) {
		//1.创建IOC容器的对象appctx(appctx为引用，你懂得~)
		//ClassPathxmlApplicationContext是ApplicationContext借口的实现类，该类实现从类路径下来加载配置文件
		ApplicationContext appctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//2.从IOC容器中得到bean实例
		Student s1= (Student) appctx.getBean("student");
		//利用id定位IOC容器中的bean
		//Student s1= appctx.getBean(Student.class);
		//利用类型返回IOC容器中的bean，但要求IOC容器中只能有一个该类型的bean
		
		
		//3.调用bean的方法，即Student类的对象s1
		s1.setGender("男");
		s1.setName("神");
		s1.setId(18);
		s1.write();
		System.out.println("学生属性:\n"+"姓名："+s1.name+"\n年龄:"+s1.id +"\n性别:"+s1.gender );
		
	}
}
