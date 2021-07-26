package com.demo.algorithm.sort;

import java.util.Arrays;

/**
 * @author ambi
 * @data 2021/7/26 19:44
 */
public class Merge {
    public static void main(String[] args) {
        int[] source = Tools.getRandomData(20);
        mergeSort(source);
        System.out.println("result:" + Arrays.toString(source));
    }

    static void mergeSort(int[] source) {
        int length = source.length;
        int[] result = new int[length];
        mergeSortRecursive(source, result, 0, length - 1);
    }

    static void mergeSortRecursive(int[] source, int[] result, int start, int end) {
        if (start >= end) return;
        int length = end - start;
        int end1 = length / 2 + start;
        int start1 = start;
        int start2 = end1 + 1;
        int end2 = end;
        mergeSortRecursive(source, result, start1, end1);
        mergeSortRecursive(source, result, start2, end2);
        int resultStart = start;
        while (start1 <= end1 && start2 <= end2) {
            result[resultStart++] = source[start1] < source[start2] ? source[start1++] : source[start2++];
        }
        while (start1 <= end1) {
            result[resultStart++] = source[start1++];
        }
        while (start2 <= end2) {
            result[resultStart++] = source[start2++];
        }
        for (int k = start; k <= end; k++) {
            source[k] = result[k];
        }
    }

}
