package com.springcore.referance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/referance/refconfig.xml");
		A temp  =(A) context.getBean("aref");
		
		
		System.out.println(temp.getX());
		
		System.out.println(temp.getOb().getY());
		
		System.out.println(temp);
	}

}