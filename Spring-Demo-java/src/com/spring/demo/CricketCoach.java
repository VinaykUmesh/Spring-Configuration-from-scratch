package com.spring.demo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("inside the setter method - emailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside the setter method - team");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("no-arg Constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside the setter method - fortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getBasketBallCoach() {
		return "Bowling Practice";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
