package com.bigo.justice.design.mode.creator.factory.shape;

import com.bigo.justice.design.mode.creator.factory.Shape;

/**
 * @author ambi
 * @data 2021/6/4 12:23
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
