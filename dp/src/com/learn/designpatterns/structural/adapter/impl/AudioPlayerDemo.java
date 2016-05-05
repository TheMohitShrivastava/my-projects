package com.learn.designpatterns.structural.adapter.impl;

import com.learn.designpatterns.structural.adapter.MediaPlayer;

public class AudioPlayerDemo {

	public static void main(String[] args) {
		MediaPlayer player = new AudioPlayer();
		player.play("MP3","Jingo");
		player.play("VLC","Jingo");
		player.play("MP3","Jingo");
		player.play("MP3","Jingo");
		player.play("MP3","Jingo");
		player.play("MP3","Jingo");
		
	}

}
