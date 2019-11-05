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
	
	//agregar methodo de inicio INIT
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	

	//agregar metodo de  destrucción
		public void doMyCleanupStuff() {
			System.out.println("TrackCoach: inside method doMyCleanupStuff");
		}
	
	

}
