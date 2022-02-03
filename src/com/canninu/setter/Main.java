package com.canninu.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.canninu.interfacee.Player;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Player player = context.getBean("myBasketPlayer", Player.class);
		Player player2 = context.getBean("myPingPongPlayer", Player.class);
		
		System.out.println(player.iAmPlay() + ", " + player.getFortuneForPlayer());
		System.out.println(player2.iAmPlay() + ", " + player2.getFortuneForPlayer());
		
		context.close();
	}
}
