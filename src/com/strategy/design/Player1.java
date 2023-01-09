package com.strategy.design;

public class Player1 extends Fighter {
	
	public Player1(KickBehavior kick,JumpBehavior jump) {
		super(kick,jump);
	}

	@Override
	public void play() {
		System.out.println("Player1");
		
	}

	
}
