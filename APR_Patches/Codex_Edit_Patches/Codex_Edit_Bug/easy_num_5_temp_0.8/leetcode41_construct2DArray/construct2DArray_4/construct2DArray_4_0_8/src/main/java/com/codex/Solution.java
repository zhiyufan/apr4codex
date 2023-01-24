package com.codex;

import java.util.*;

public class Solution {
    public static void construct2DArray(int[] original, int m, int n) {
        int[][] arr = null;
        if (original.length == (m * n)) {
            arr = new int[m][n];
            int k = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = original[k];
                    k += 1;
                }
            }
            System.out.println(Arrays.deepToString(arr));
        } else {
            System.out.println("Invalid input");
        }

    }

}