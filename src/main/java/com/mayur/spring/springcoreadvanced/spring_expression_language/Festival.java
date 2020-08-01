package com.mayur.spring.springcoreadvanced.spring_expression_language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Festival {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mayur/spring/springcoreadvanced/spring_expression_language/config.xml");
	
		GaneshFestival festival = (GaneshFestival) context.getBean("Bappa");
		System.out.println(festival);
		((AbstractApplicationContext) context).close();
	}
}
