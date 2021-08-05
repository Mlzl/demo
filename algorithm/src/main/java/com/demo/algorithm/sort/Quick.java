package com.demo.algorithm.sort;

import java.util.Arrays;

/**
 * @author ambi
 * @data 2021/7/30 16:37
 */
public class Quick {

    public static void main(String[] args) {
        int[] source = Tools.getRandomData(20);
        System.out.println(Arrays.toString(source));

        quick(source, 0, source.length - 1);
        System.out.println(Arrays.toString(source));
    }

    private static void quick(int[] source, int start, int end) {
        if (start >= end) return;
        int partition = partition(source, start, end);
        quick(source, start, partition - 1);
        quick(source, partition + 1, end);
    }

    private static int partition(int[] source, int start, int end) {
        int example = source[start];
        while (start < end) {
            while (start < end && source[end] >= example) {
                end--;
            }
            if (start < end) {
                source[start] = source[end];
            }
            while (start < end && source[start] <= example) {
                start++;
            }
            if (start < end) {
                source[end] = source[start];
            }
        }
        source[start] = example;
        return start;
    }

}
