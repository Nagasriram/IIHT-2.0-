package com.core.SpringCoreDemo.ReferenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/ReferenceInjection/Refconfig.xml");
		 Object1 obj1=(Object1) context.getBean("obj1");
		 System.out.println(obj1);

	}

}
