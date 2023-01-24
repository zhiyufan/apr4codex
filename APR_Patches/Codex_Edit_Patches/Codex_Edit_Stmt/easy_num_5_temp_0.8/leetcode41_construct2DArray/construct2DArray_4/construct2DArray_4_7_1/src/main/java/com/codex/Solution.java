package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {

        int[][] arr = new int[original.length / n][n];
        int k = 0; // индекс массива
        for (int i = 0; i < original.length / n; i++) {
            arr[i] = Arrays.copyOfRange(original, k, k + n);
            k += n;
        }

        return arr;
    }
}