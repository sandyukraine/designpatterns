package com.sandy.training;

public class BandFactory {

	public Player getPlayer(String instrument) {
		Player player = null;
		if (instrument.equals("drums")) {
			player = new DrumsPlayer();
		} else if(instrument.equals("bass")) {
			player = new BassPlayer();
		} else if(instrument.equals("guitar")) {
			player = new GuitarPlayer();
		}
		return player;
	}
}
