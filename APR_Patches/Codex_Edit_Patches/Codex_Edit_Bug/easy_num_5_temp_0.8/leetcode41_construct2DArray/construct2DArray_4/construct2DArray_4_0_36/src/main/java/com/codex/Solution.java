package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] arr = new int[m][];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int remaining = original.length - count;
            int cols = Math.min(n, remaining);
            arr[i] = new int[cols];
            for (int j = 0; j < arr[i].length; j++, count++) {
                if (count < original.length) {
                    arr[i][j] = original[count];
                }
            }
        }
        return arr;
    }
}