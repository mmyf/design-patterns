package com.etudes.design.patterns.adapter.impl;

import com.etudes.design.patterns.adapter.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		// do nothing
	}

	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}