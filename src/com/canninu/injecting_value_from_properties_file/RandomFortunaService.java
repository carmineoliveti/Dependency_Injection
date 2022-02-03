package com.canninu.injecting_value_from_properties_file;

import java.util.Random;

import com.canninu.interfacee.FortuneService;

public class RandomFortunaService implements FortuneService {
	
	private Random myRandom = new Random();

	private String [] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"};
	
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		return data[index];
	}

}
