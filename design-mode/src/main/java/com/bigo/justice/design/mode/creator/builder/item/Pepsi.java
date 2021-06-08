package com.bigo.justice.design.mode.creator.builder.item;

/**
 * @author ambi
 * @data 2021/6/8 17:48
 */
public class Pepsi extends AbstractColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 0.5F;
    }
}
