package com.strategy.design;

public class Test {

	public static void main(String[] args) {
		JumpBehavior shortJump=new ShortJump();
		JumpBehavior longJump=new LongJump();
		KickBehavior tornadoKick=new TornadoKick();
		
		Fighter player1=new Player1(tornadoKick, shortJump);
		player1.play();
		
		player1.punch();
		player1.roll();
		player1.kick();
		player1.jump();
	}
}
