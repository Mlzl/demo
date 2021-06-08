package com.bigo.justice.design.mode.creator.builder.item;

import com.bigo.justice.design.mode.creator.builder.Packing;
import com.bigo.justice.design.mode.creator.builder.packing.Wrapper;

/**
 * @author ambi
 * @data 2021/6/8 17:48
 */
public class VegAbstractBurger extends AbstractBurger {

    @Override
    public String name() {
        return "vegBurger";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 2.5F;
    }
}
