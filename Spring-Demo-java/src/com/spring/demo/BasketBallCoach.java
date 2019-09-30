package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {

	private FortuneService fortuneService;

	public BasketBallCoach() {
	}

	public BasketBallCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	public String getBasketBallCoach() {
		return "Warm up";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	public void beanInitMethod() {
		System.out.println("Bean Instantiated method");
	}

	public void beanDestroyMethod() {
		System.out.println("Bean destroy method");
	}

}
