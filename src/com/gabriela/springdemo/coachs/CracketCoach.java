package com.gabriela.springdemo.coachs;

import com.gabriela.springdemo.service.FortuneService;

public class CracketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public  CracketCoach() {
		System.out.println("CracketCoach contructor vacio");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practica bolos por 15 minutos";
	}

	@Override
	public String getDailyFourtune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}



	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CracketCoach setter vacio");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CracketCoach setter emailAddres");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CracketCoach setter team");
		this.team = team;
	}
	

	
	
	

}
