package com.gabriela.springdemo.coachs;

import com.gabriela.springdemo.service.FortuneService;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	
	
	public TrackCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run a hard 5K";
	}

	@Override
	public String getDailyFourtune() {
		// TODO Auto-generated method stub
		return "Solo haslo" +fortuneService.getFortune();
	}
	
	
	

}
