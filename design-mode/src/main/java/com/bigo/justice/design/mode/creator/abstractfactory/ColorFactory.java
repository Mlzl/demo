package com.bigo.justice.design.mode.creator.abstractfactory;

import com.bigo.justice.design.mode.creator.abstractfactory.color.Red;
import com.bigo.justice.design.mode.creator.abstractfactory.color.Yellow;
import com.bigo.justice.design.mode.creator.factory.Shape;

/**
 * @author ambi
 * @data 2021/6/4 12:31
 */
public class ColorFactory extends AbstractFactory {
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("yellow")) {
            return new Yellow();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
