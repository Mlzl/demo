package com.bigo.justice.design.mode.creator.builder.item;

import com.bigo.justice.design.mode.creator.builder.Item;
import com.bigo.justice.design.mode.creator.builder.Packing;
import com.bigo.justice.design.mode.creator.builder.packing.Bottle;

/**
 * @author ambi
 * @data 2021/6/8 17:48
 */
public class Coke extends AbstractColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 0.5F;
    }
}
