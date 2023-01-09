package com.strategy.design;

public class LightningKick implements KickBehavior{

	@Override
	public void kick() {
		System.out.println("Lightning Kick Activated Hitting now");
		
	}

}
