package com.core.SpringCoreDemo.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/collection/collectionconfig.xml");
		Employee e1=(Employee) context.getBean("emp1");
		System.out.println(e1.getEmployeeName());
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCourses());
		System.out.println(e1.getProps());
	}

}
