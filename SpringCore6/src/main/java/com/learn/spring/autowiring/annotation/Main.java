package com.learn.spring.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/autowiring/annotation/config.xml");
		Employee emp=(Employee) ctx.getBean("emp");
		System.out.println(emp.toString());
	}
}
