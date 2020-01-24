package com.mylearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Airtel aitel = context.getBean("airtel", Airtel.class);
		System.out.println("Success!!");
		aitel.whichService();
		
	}
}
