package com.design.patterns.adapterpattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc" , "vlcfilname");
        audioPlayer.play("mp3" , "mp3filname");
        audioPlayer.play("mp4" , "mp4filname");
        audioPlayer.play("avi" , "avifilname");
    }
}
