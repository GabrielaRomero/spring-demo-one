package com.gabriela.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gabriela.springdemo.coachs.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		

		
		
		context.close();
	}

}
