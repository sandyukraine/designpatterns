package com.sandy.training.main;

import com.sandy.training.BandFactory;
import com.sandy.training.Player;

public class BandComposer {

	public static void main(String[] args) {
		BandFactory bandFactory = new BandFactory();
		
		Player drumsPlayer = bandFactory.getPlayer("drums");
		drumsPlayer.play();
		
		Player bassPlayer = bandFactory.getPlayer("bass");
		bassPlayer.play();
		
		Player guitarPlayer = bandFactory.getPlayer("guitar");
		guitarPlayer.play();
	}

}
