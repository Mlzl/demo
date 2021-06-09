package com.bigo.justice.design.mode.structure.adapter;

/**
 * @author ambi
 * @data 2021/6/9 10:04
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("mp4 play " + fileName);
    }
}
