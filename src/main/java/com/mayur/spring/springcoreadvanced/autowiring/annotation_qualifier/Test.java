package com.mayur.spring.springcoreadvanced.autowiring.annotation_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/spring/springcoreadvanced/autowiring/annotation_qualifier/config.xml");
		Home home = (Home) context.getBean("home");
		System.out.println(home);
		((AbstractApplicationContext) context).close();
	}
}
