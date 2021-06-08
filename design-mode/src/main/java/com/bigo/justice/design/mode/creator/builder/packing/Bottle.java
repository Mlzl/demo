package com.bigo.justice.design.mode.creator.builder.packing;

import com.bigo.justice.design.mode.creator.builder.Packing;

/**
 * @author ambi
 * @data 2021/6/8 17:47
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
