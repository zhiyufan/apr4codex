package com.codex;

import java.util.*;

public class Solution {
public class SomeSort {

    public static void main(String[] args) {

        int[] test = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        someSort(test);

        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

    }


    public static int[] someSort(int[] a) {
        if (a.length == 1) return a;
        for (int i = a.length-1; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if (a[j] > a[j+1]) {
                    swap(a, j, j+1);
                }
            }
        }
        return a;
    }

    public static int[] swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}
}