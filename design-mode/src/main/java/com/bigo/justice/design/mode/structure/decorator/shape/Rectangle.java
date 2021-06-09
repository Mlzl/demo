package com.bigo.justice.design.mode.structure.decorator.shape;

import com.bigo.justice.design.mode.structure.decorator.Shape;

/**
 * @author ambi
 * @data 2021/6/9 15:38
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}
