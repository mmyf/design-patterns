package com.etudes.design.patterns.adapter.impl;

import com.etudes.design.patterns.adapter.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	public void playMp4(String fileName) {
		// do nothing
	}
}