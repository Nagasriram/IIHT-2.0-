package com.core.SpringCoreDemo.ReferenceInjectionTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.SpringCoreDemo.ReferenceInjection.Object1;

public class TestRef1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/ReferenceInjectionTest/RefTestconfig.xml");
		 StudentDetails s1=(StudentDetails) context.getBean("student1");
		 System.out.println(s1.getStudentName());
		 System.out.println(s1.getStudentClass());
		 System.out.println(s1.getStudentAge());
		 System.out.println(s1.getStudentCity());
		 System.out.println(s1.getSubs());

	}

}
