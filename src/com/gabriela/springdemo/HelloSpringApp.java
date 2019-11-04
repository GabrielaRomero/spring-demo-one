package com.gabriela.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gabriela.springdemo.coachs.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cargar el archivo de configuracion de spring
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//recuperar el bean desde el contenedor de spring
		Coach  theCoach = context.getBean("myCoach", Coach.class);
		
		//llamar los metodos sobrbe el bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFourtune());
		
		//cerrar el contexto
		context.close();

	}

}
