package com.demo.spring;

public interface Coach {
	public String getDailyWorkout();
	// injecting fortune dependency to Coach
	public String getDailyFortune();
}
