package com.bigo.justice.design.mode.creator.builder;

import com.bigo.justice.design.mode.creator.builder.item.Coke;
import com.bigo.justice.design.mode.creator.builder.item.VegBurger;

/**
 * @author ambi
 * @data 2021/6/8 17:59
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal meal = builder.prepareVegMeal();
        meal.showItems();
        System.out.println("total cost: " + meal.getCost());
    }
}
