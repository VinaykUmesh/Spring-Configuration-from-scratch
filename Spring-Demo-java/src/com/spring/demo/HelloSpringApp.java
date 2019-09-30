package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("basketBallCoach", Coach.class);
		
		System.out.println(coach.getBasketBallCoach());
		System.out.println(coach.getFortune());
		
		context.close();
		
	}

}
