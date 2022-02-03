package com.canninu.injecting_literal_values;

import com.canninu.interfacee.FortuneService;
import com.canninu.interfacee.Player;

public class FootbaalPlayer implements Player {
	
	private FortuneService fortuneService;
	private String EmailAddress;
	private String Team;

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
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
