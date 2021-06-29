package com.zemulabs.bridgepattern.devices;

public class TV implements Device {
	
	private boolean on = false;
	private int channel = 1;
	private int volume = 30;

	@Override
	public boolean isEnabled() {
		return this.on;
	}

	@Override
	public void enable() {
		this.on = true;
	}

	@Override
	public void disable() {
		this.on = false;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
			this.volume = 100;
		} else if (volume < 0) {
			this.volume = 1;
		} else {
			this.volume = volume;
		}
	}

	@Override
	public int getChannel() {
		return this.channel;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void printStatus() {
		System.out.println("---------------------");
		System.out.println("I am TV");
		System.out.println("I am " + (this.on ? "enabled" : "disabled"));
		System.out.println("Current volume is " + this.volume);
		System.out.println("Current channel is " + this.channel);
		System.out.println("---------------------");		
	}

}
