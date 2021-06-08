package com.bigo.justice.design.mode.creator.builder.item;

import com.bigo.justice.design.mode.creator.builder.Packing;
import com.bigo.justice.design.mode.creator.builder.packing.Wrapper;

/**
 * @author ambi
 * @data 2021/6/8 17:48
 */
public class ChickenBurger extends AbstractBurger {

    @Override
    public String name() {
        return "chickenBurger";
    }

    @Override
    public float price() {
        return 5.5F;
    }
}
