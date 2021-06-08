package com.bigo.justice.design.mode.creator.abstractfactory.color;

import com.bigo.justice.design.mode.creator.abstractfactory.Color;

/**
 * @author ambi
 * @data 2021/6/4 12:31
 */
public class Yellow implements Color {

    @Override
    public void fill() {
        System.out.println("fill yellow");
    }
}
