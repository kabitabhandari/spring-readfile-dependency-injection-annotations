package com.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaApp {
	public static void main(String[] args) {
		//read/ loadspring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get/ retrieve beans from spring container
		Coach coach = context.getBean("pingPongCoach", Coach.class); // implementing class id and interface class
		
		//call a method on beans
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		//close context
		context.close();
		
		
		/*
		
		// above line of codes acn be represented as
		Coach coach =new PingPongCoach();
		System.out.println(coach.getDailyWorkout());
		
		*/
		
	}

}
