package com.canninu.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.canninu.interfacee.Player;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Player footballPlayer = context.getBean("footballPlayer", Player.class);
		Player tennisPlayer = context.getBean("tennisPlayer", Player.class);
		
		System.out.println(footballPlayer.iAmPlay() + ", " + footballPlayer.getFortuneForPlayer());
		System.out.println(tennisPlayer.iAmPlay() + ", " + tennisPlayer.getFortuneForPlayer());
		
		context.close();
	}
}
