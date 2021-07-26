package com.demo.algorithm.sort;

/**
 * @author ambi
 * @data 2021/7/26 16:19
 */
public class Tools {

    public static int[] getRandomData(int length) {
        int[] source = new int[length];
        for (int i = 0; i < length; i++) {
            source[i] = (int) (Math.random() * 100);
        }
        return source;
    }

    public static void swap(int[] target, int i, int j) {
        int tmp = target[i];
        target[i] = target[j];
        target[j] = tmp;
    }

}
