package com.design.patterns.adapterpattern;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();

        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equals(audioType)) {
            advancedMediaPlayer.playVlc("fileName " + fileName);
        }
        if ("mp4".equals(audioType)) {
            advancedMediaPlayer.playMp4("fileName " + fileName);
        }
    }
}
