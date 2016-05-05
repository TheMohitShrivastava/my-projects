package com.learn.designpatterns.structural.adapter.impl;

import com.learn.designpatterns.structural.adapter.AdvancedMediaPlayer;
import com.learn.designpatterns.structural.adapter.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer amp;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equals("VLC")){
			amp = new VLCPlayer();
		}else{
			amp = new MP4Player();
		}
		amp.play(fileName);
	}

}
