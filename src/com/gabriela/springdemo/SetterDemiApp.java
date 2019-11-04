package com.gabriela.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gabriela.springdemo.coachs.Coach;
import com.gabriela.springdemo.coachs.CracketCoach;

public class SetterDemiApp {

	public static void main(String[] args) {
		// Cargar archivo de configuracion de Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Recuperrar el bean desde el contenedor de Spring
		CracketCoach theCoach = context.getBean("myCricketCoach", CracketCoach.class);
		
		//llamar metodos del bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFourtune());
		
		//llamar los metodos de los valores literales
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		
		
		//Cerrar el contexto
		context.close();
		
	
		

	}

}
