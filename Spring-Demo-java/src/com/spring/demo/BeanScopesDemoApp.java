package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesDemoApp {

	public static void main(String[] args) {
		
		//ClasspathXmlApplication for loading bean container location
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopes-applicationContext.xml");
		
		//fetching object through  bean container
		Coach theCoach = context.getBean("theCoach", Coach.class);
		
		Coach anotherCoach = context.getBean("theCoach", Coach.class);
		
		System.out.printf("\n Memory Loaction of theCoach : %s",theCoach);
		
		System.out.printf("\n\n Memory Loaction of theCoach : %s",anotherCoach);
		
		System.out.printf("\n\n Bean Scope : %s",(theCoach == anotherCoach) ? "Singleton" : "Prototype");
		
		context.close();
		
	}

}
