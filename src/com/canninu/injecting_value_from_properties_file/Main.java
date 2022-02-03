package com.canninu.injecting_value_from_properties_file;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("injecting_value_from_properties_file.xml");
		
		GolfPlayer player = context.getBean("golfPlayer", GolfPlayer.class);
		
		System.out.println(player.iAmPlay());
		System.out.println(player.getEmailAddress());
		System.out.println(player.getTeam());
		System.out.println(player.getFortuneForPlayer());
		
		context.close();
	}
}
