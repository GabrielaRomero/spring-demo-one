package com.gabriela.springdemo.service;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hoy es tu dia de suerte";
	}

}
