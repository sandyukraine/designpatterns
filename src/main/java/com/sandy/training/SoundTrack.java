package com.sandy.training;

public class SoundTrack {

	private String name;
	private String instrument;
	private int volume;
	private int balance;
	private String color;
	
	public SoundTrack(final String name, final String instrument, final int volume, final int balance, final String color) {
		this.name = name;
		this.instrument = instrument;
		this.volume = volume;
		this.balance = balance;
		this.color = color;
	}
}
