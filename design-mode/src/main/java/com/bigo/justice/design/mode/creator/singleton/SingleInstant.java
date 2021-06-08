package com.bigo.justice.design.mode.creator.singleton;

/**
 * @author ambi
 * @data 2021/6/8 17:31
 */
public class SingleInstant {

    private static SingleInstant instant = new SingleInstant("single dog");

    private String name;

    private SingleInstant(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("say hello " + name);
    }

    public static SingleInstant getInstant() {
        return instant;
    }

    public static void main(String[] args) {
        getInstant().hello();
    }

}
