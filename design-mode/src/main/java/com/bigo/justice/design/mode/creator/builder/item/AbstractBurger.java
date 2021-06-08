package com.bigo.justice.design.mode.creator.builder.item;

import com.bigo.justice.design.mode.creator.builder.Item;
import com.bigo.justice.design.mode.creator.builder.Packing;
import com.bigo.justice.design.mode.creator.builder.packing.Wrapper;

/**
 * @author ambi
 * @data 2021/6/8 17:48
 */
public abstract class AbstractBurger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
