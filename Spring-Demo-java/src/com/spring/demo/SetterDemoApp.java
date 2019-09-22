package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//Configuring applicationContext.xml in ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from applicationContext.xml\
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(cricketCoach.getBasketBallCoach());
		
		System.out.println(cricketCoach.getFortune());
		
		System.out.println(cricketCoach.getEmailAddress());
		
		System.out.println(cricketCoach.getTeam());
		
		//closing context
		context.close();
		
	}

}
