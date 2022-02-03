package com.canninu.setter;

import com.canninu.interfacee.FortuneService;
import com.canninu.interfacee.Player;

public class PingPongPlayer implements Player {

	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String iAmPlay() {
		return "I am a ping pong player";
	}

	@Override
	public String getFortuneForPlayer() {
		return fortuneService.getFortune();
	}

}
