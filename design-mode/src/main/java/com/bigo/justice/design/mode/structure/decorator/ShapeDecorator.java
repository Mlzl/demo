package com.bigo.justice.design.mode.structure.decorator;

/**
 * @author ambi
 * @data 2021/6/9 15:39
 */
public class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
