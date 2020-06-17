package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {
	// injecting fortune dependency to Coach steps
	
	private FortuneService fortuneService;
	
	public PingPongCoach() { // o arg constructor
	}

	@Autowired
	public PingPongCoach(FortuneService fortuneService) { // 1 arg constructor
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "wake up at 5 am and go for a run";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	
}
