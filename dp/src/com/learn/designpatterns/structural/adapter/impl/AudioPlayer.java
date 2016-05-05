package com.learn.designpatterns.structural.adapter.impl;

import com.learn.designpatterns.structural.adapter.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

	private MediaAdapter ma;
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equals("MP3")){
			System.out.println("Playing MP3:"+fileName);
		}else{
			ma = new MediaAdapter();
			ma.play(audioType, fileName);
		}
		
	}
}
