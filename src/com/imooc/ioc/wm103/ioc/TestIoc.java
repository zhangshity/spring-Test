package com.imooc.ioc.wm103.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DreamBoy on 2018/3/17.
 */
public class TestIoc {
    @Test
    public void runUser() {
        // 1. 加载Spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 得到配置创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
    }
    
    public static void main(String[] args) {
	 TestIoc  ti  	=  new TestIoc();
	 ti.runUser();
	}
}