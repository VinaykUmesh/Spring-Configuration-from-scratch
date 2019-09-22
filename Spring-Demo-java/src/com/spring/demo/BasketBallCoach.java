package com.spring.demo;

public class BasketBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BasketBallCoach() {}
	
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
	
	

}
