package com.sandy.training.main;

import com.sandy.training.SoundTrack;

public class RecordingApp {

	public static void main(String[] args) {
		SoundTrack soundTrack = new SoundTrack.SoundTrackBuilder("Solo guitar", "guitar").setVolume(50).setBalance(0).setColor("gray").build();
		System.out.println(soundTrack);
	}
}
