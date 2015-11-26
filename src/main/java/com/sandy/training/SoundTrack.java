package com.sandy.training;

public class SoundTrack {

	private String name;
	private String instrument;
	private int volume;
	private int balance;
	private String color;
	
	public SoundTrack(SoundTrackBuilder soundTrackBuilder) {
		this.name = soundTrackBuilder.name;
		this.instrument = soundTrackBuilder.instrument;
		this.volume = soundTrackBuilder.volume;
		this.balance = soundTrackBuilder.balance;
		this.color = soundTrackBuilder.color;
	}

	public String getName() {
		return name;
	}

	public String getInstrument() {
		return instrument;
	}

	public int getVolume() {
		return volume;
	}

	public int getBalance() {
		return balance;
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "SoundTrack [name=" + name + ", instrument=" + instrument + ", volume=" + volume + ", balance=" + balance
				+ ", color=" + color + "]";
	}

	public static class SoundTrackBuilder {
		private String name;
		private String instrument;
		private int volume = 50;
		private int balance = 0;
		private String color = "gray";
		
		public SoundTrackBuilder(String name, String instrument) {
			this.name = name;
			this.instrument = instrument;
		}
		
		public SoundTrackBuilder setVolume(int volume) {
			this.volume = volume;
			return this;
		}
		
		public SoundTrackBuilder setBalance(int balance) {
			this.balance = balance;
			return this;
		}
		
		public SoundTrackBuilder setColor(String color) {
			this.color = color;
			return this;
		}
		
		public SoundTrack build() {
			SoundTrack soundTrackBuilder = new SoundTrack(this);
			return soundTrackBuilder;
		}
	}
}
