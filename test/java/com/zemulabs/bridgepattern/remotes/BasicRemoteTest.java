package com.zemulabs.bridgepattern.remotes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import com.zemulabs.bridgepattern.devices.Radio;
import com.zemulabs.bridgepattern.remotes.Remote;


public class BasicRemoteTest {
	
	private Radio radio = new Radio();
	private BasicRemote remote = new BasicRemote(radio);
	private final int VOLUME_STEP = 10;
	
	@Test
	public void shouldPowerOn() {
		remote.power();
		assertTrue( radio.isEnabled() );
	}
	
	@Test
	public void shouldPowerOff() {
		remote.power();
		remote.power();
		assertTrue( !radio.isEnabled() );
	}
	
	@Test
	public void shouldIncreaseVolume() {
		int currentVolume = radio.getVolume();
		remote.volumeUp();
		assertTrue( (radio.getVolume() == currentVolume + VOLUME_STEP) );
	}

	@Test
	public void shouldDecreaseVolume() {
		int currentVolume = radio.getVolume();
		remote.volumeDown();
		assertTrue( (radio.getVolume() == currentVolume - VOLUME_STEP) );
	}
	
	@Test
	public void shouldChangeChannelUp() {
		int currentChannel = radio.getChannel();
		remote.channelUp();
		assertTrue( (radio.getChannel() == currentChannel + 1) );
	}
	
	@Test
	public void shouldChangeChannelDown() {
		radio.setChannel(10);
		int currentChannel = radio.getChannel();
		remote.channelDown();
		assertTrue( (radio.getChannel() == currentChannel - 1) );
	}
}
