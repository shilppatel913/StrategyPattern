package com.strategy.design;

public class TornadoKick implements KickBehavior{

	@Override
	public void kick() {
		System.out.println("Tornado Kick Activated Hitting now");
		
	}

}
