package com.bigo.justice.design.mode.structure.decorator;

import com.bigo.justice.design.mode.structure.decorator.shape.Circle;
import com.bigo.justice.design.mode.structure.decorator.shape.Rectangle;

/**
 * @author ambi
 * @data 2021/6/9 15:43
 */
public class Decorator {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
