package com.bigo.justice.design.mode.structure.adapter;

/**
 * @author ambi
 * @data 2021/6/9 10:04
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("vlc: play " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
