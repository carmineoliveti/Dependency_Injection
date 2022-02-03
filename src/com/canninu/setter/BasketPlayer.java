package com.canninu.setter;

import com.canninu.interfacee.FortuneService;
import com.canninu.interfacee.Player;

public class BasketPlayer implements Player {
	
	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("i am in a setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String iAmPlay() {
		return "I am a Basket player";
	}

	@Override
	public String getFortuneForPlayer() {
		return fortuneService.getFortune();
	}

}
