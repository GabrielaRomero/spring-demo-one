package com.gabriela.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gabriela.springdemo.coachs.Coach;

public class BeanLifeCyrcñeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Checar si son iguales
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Apuntando  a los mismo objetos "+result);
		System.out.println("Ubicacion de memoria para theCoach "+theCoach);
		System.out.println("Ubicacion de memoria para alphaCoach "+alphaCoach);
		
		
		context.close();
	}

}
