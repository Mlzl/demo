package com.demo.algorithm.sort;

import org.apache.logging.log4j.util.Strings;
import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * @author ambi
 * @data 2021/7/26 16:05
 */
public class Bubble {
    public static void main(String[] args) {
        int length = 10;
        int[] source = Tools.getRandomData(length);
        System.out.println("source:" + Arrays.toString(source));
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (source[j] < source[i]) {
                    Tools.swap(source, i, j);
                }
            }
        }
        System.out.println("target:" + Arrays.toString(source));
    }

}
