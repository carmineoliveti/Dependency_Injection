package com.canninu.constructor;

import com.canninu.interfacee.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Good luck!";
	}

}
