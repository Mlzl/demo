package com.bigo.justice.design.mode.creator.abstractfactory;

import com.bigo.justice.design.mode.creator.factory.Shape;

/**
 * @author ambi
 * @data 2021/6/4 12:33
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
