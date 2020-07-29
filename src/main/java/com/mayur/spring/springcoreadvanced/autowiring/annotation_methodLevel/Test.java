package com.mayur.spring.springcoreadvanced.autowiring.annotation_methodLevel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/spring/springcoreadvanced/autowiring/annotation_methodLevel/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		((AbstractApplicationContext) context).close();

	}

}
