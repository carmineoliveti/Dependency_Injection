package com.canninu.constructor;

import com.canninu.interfacee.FortuneService;
import com.canninu.interfacee.Player;

public class TennisPlayer implements Player{

	private final FortuneService fortuneService;
	
	//constructor injection
	public TennisPlayer(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String iAmPlay() {
		return "I am tennis player";
	}

	@Override
	public String getFortuneForPlayer() {
		return fortuneService.getFortune();
	}

}
