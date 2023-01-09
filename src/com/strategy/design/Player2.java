package com.strategy.design;

public class Player2 extends Fighter{

	public Player2(KickBehavior kick,JumpBehavior jump) {
		super(kick,jump);
	}

	@Override
	public void play() {
		System.out.println("Player2");
		
	}
}
