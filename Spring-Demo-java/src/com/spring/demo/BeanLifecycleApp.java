package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		Coach theCoach = context.getBean("theCoach", Coach.class);
		
		Coach anotherCoach = context.getBean("theCoach", Coach.class);
		
		System.out.println((theCoach == anotherCoach) ? "Singleton" : "Prototype");
		
		context.close();
		

	}

}
