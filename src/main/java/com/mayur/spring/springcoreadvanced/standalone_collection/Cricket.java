package com.mayur.spring.springcoreadvanced.standalone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricket {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/spring/springcoreadvanced/standalone_collection/config.xml");

		T20 matchT20  = (T20)context.getBean("t20");
		System.out.println(matchT20);
		
		OneDay matchOneDay =  (OneDay)context.getBean("oneday");
		System.out.println(matchOneDay);
		
		((AbstractApplicationContext) context).close();
	}

}
