package com.etudes.design.patterns.adapter.impl;

import com.etudes.design.patterns.adapter.AdvancedMediaPlayer;
import com.etudes.design.patterns.adapter.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {

		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();

		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

	public void play(String audioType, String fileName) {

		if (audioType != null && audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType != null && audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}