package com.mycompany.springdemo2.Coach;

import org.springframework.stereotype.Component;
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
}
