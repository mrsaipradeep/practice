package com.design.patterns.adapterpattern;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equals(audioType) || "mp4".equals(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }

        else if ("mp3".equals(audioType)) {
            System.out.println("Playing mp3 file" + fileName);

        } else {
            System.out.println("Invalid audioType " + audioType + " : fileName : " + fileName);
        }


    }
}
