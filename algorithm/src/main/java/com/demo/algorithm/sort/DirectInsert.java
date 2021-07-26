package com.demo.algorithm.sort;

import java.util.Arrays;

/**
 * @author ambi
 * @data 2021/7/26 19:31
 */
public class DirectInsert {
    public static void main(String[] args) {
        int length = 10;
        int[] source = Tools.getRandomData(length);
        int j;
        for (int i = 0; i < length; i++) {
            int tmp = source[i];
            for (j = i - 1; j >= 0; j--) {
                if (tmp < source[j]) {
                    source[j + 1] = source[j];
                    continue;
                }
                break;
            }
            source[j + 1] = tmp;
        }
        System.out.println("target:" + Arrays.toString(source));
    }
}
