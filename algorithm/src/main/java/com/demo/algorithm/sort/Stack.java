package com.demo.algorithm.sort;

import java.util.Arrays;

/**
 * @author ambi
 * @data 2021/7/31 11:54
 */
public class Stack {
    public static void main(String[] args) {
        int length = 20;
        int[] source = Tools.getRandomData(20);

        System.out.println(Arrays.toString(source));

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            stack(result, i, source[i]);
        }
        System.out.println(Arrays.toString(result));
    }

    private static void stack(int[] result, int index, int value) {
        result[index] = value;
        while (true) {
            int parent = index / 2;
            if (result[index] >= result[parent]) {
                break;
            }
            swap(result, index, parent);
            index = parent;
        }
    }

    private static void swap(int[] result, int a, int b) {
        int tmp = result[a];
        result[a] = result[b];
        result[b] = tmp;
    }
}
