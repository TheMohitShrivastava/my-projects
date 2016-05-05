package com.learn.designpatterns.structural.adapter.impl;

import com.learn.designpatterns.structural.adapter.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {


	@Override
	public void play(String fileName) {
		System.out.println("Playing Mp4 file:"+fileName);
		
	}

}
