package com.bigo.justice.design.mode.creator.factory;

import com.bigo.justice.design.mode.creator.abstractfactory.AbstractFactory;
import com.bigo.justice.design.mode.creator.abstractfactory.Color;
import com.bigo.justice.design.mode.creator.factory.shape.Circle;
import com.bigo.justice.design.mode.creator.factory.shape.Square;

/**
 * @author ambi
 * @data 2021/6/4 12:19
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
