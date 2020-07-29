package com.mayur.spring.springcoreadvanced.autowiring.xmlconfig_byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/spring/springcoreadvanced/autowiring/xmlconfig_byName/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		((AbstractApplicationContext) context).close();

	}

}
