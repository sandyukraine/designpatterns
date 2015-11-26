package com.sandy.training.main;

import com.sandy.training.BassPlayer;
import com.sandy.training.DrumsPlayer;
import com.sandy.training.GuitarPlayer;
import com.sandy.training.Player;

public class BandComposer {

	public static void main(String[] args) {
		Player drumsPlayer = new DrumsPlayer();
		drumsPlayer.play();
		
		Player bassPlayer = new BassPlayer();
		bassPlayer.play();
		
		Player guitarPlayer = new GuitarPlayer();
		guitarPlayer.play();
	}

}
