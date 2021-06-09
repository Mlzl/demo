package com.bigo.justice.design.mode.structure.facade.shape;

import com.bigo.justice.design.mode.structure.facade.Shape;

/**
 * @author ambi
 * @data 2021/6/9 15:38
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle");
    }
}
