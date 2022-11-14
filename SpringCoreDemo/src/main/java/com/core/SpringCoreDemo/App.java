package com.core.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student s=(Student) context.getBean("student1");
		System.out.println(s);
		

	}

}
