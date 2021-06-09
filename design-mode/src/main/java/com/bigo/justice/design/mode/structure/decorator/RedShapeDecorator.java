package com.bigo.justice.design.mode.structure.decorator;

/**
 * @author ambi
 * @data 2021/6/9 15:39
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Red Color");
    }

}
