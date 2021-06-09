package com.bigo.justice.design.mode.structure.bridge;

/**
 * @author ambi
 * @data 2021/6/9 12:09
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("red-circle");
    }
}
