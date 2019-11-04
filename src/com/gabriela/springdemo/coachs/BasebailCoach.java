package com.gabriela.springdemo.coachs;

import com.gabriela.springdemo.service.FortuneService;

public class BasebailCoach implements Coach{
	
	//dependencia
	private FortuneService fortuneService;
	
	//Contructor
	public BasebailCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;	
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFourtune() {
		return fortuneService.getFortune();
	}

}
 