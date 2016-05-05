package com.learn.designpatterns.structural.adapter.impl;

import com.learn.designpatterns.structural.adapter.AdvancedMediaPlayer;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void play(String fileName) {
		System.out.println("Playing VLC file:"+fileName);	
	}

}
