package com.demo.algorithm.sort;

import java.util.Arrays;

/**
 * @author ambi
 * @data 2021/7/26 16:05
 */
public class SimpleSort {
    public static void main(String[] args) {
        int length = 10;
        int[] source = Tools.getRandomData(length);
        System.out.println("source:" + Arrays.toString(source));
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (source[min] > source[j]) {
                    min = j;
                }
            }
            if (min != i) {
                Tools.swap(source, i, min);
            }
        }
        System.out.println("target:" + Arrays.toString(source));
    }

}
