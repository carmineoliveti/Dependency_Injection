package com.canninu.constructor;

import com.canninu.interfacee.FortuneService;
import com.canninu.interfacee.Player;

public class FootballPlayer implements Player {

	private FortuneService fortuneService;
	
	public FootballPlayer() {}
	
	//constructor injection
	public FootballPlayer(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String iAmPlay() {
		return "I am football player";
	}

	@Override
	public String getFortuneForPlayer() {
		return fortuneService.getFortune();
	}

}
