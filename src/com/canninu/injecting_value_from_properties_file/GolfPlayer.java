package com.canninu.injecting_value_from_properties_file;

import com.canninu.interfacee.FortuneService;
import com.canninu.interfacee.Player;

public class GolfPlayer implements Player {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public GolfPlayer(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String iAmPlay() {
		return "I am golf player";
	}

	@Override
	public String getFortuneForPlayer() {
		return fortuneService.getFortune();
	}
	
}
