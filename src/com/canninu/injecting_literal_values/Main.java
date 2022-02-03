package com.canninu.injecting_literal_values;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.canninu.interfacee.Player;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FootbaalPlayer footballPlayer = context.getBean("football_player", FootbaalPlayer.class);
		
		System.out.println("Email address: " + footballPlayer.getEmailAddress());
		System.out.println("Team: " + footballPlayer.getTeam());
		
		context.close();

	}

}
