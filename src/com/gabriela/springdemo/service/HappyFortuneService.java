package com.gabriela.springdemo.service;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private String[] arrayFortunas = {"Buena suerte", "tu puedes hacerlo", "Eres el mejor"};
	
	private Random random = new Random();

	@Override
	public String getFortune() {
		int seleccionado = random.nextInt(arrayFortunas.length);
		String fortuna = arrayFortunas[seleccionado];
		
		return  fortuna;
	}

}
