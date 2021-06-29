package com.zemulabs.bridgepattern.remotes;

import org.junit.Test;

import com.zemulabs.bridgepattern.devices.Radio;

import static org.junit.Assert.assertTrue;

public class AdvancedRemoteTest {
	
	private Radio radio = new Radio();
	
	private AdvancedRemote remote = new AdvancedRemote(radio);
	
	@Test
	public void shouldMuteVolume() {
		remote.mute();
		assertTrue( (radio.getVolume() == 0) );
	}

}
