package com.mayur.spring.springcoreadvanced.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mayur/spring/springcoreadvanced/stereotype_annotation/config.xml");
		Hospital ganpati = (Hospital)context.getBean("hosp");
		System.out.println(ganpati + " " + ganpati.hashCode());
		
		Hospital civil = (Hospital)context.getBean("hosp");
		System.out.println(civil + " " + civil.hashCode());
		
		((AbstractApplicationContext) context).close();
	}
}
