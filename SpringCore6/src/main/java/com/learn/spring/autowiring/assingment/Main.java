package com.learn.spring.autowiring.assingment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/autowiring/assingment/config.xml");
		Customer cust = (Customer) ctx.getBean("cust");
		System.out.println(cust.toString());

	}

}
