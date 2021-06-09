package com.bigo.justice.design.mode.structure.bridge;

/**
 * @author ambi
 * @data 2021/6/9 12:10
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
