package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] arr = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (k < original.length) {
                    arr[i][j] = original[k];
                    k += 1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5};
        int[][] arr = construct2DArray(original, 2, 3);

        for (int i = 0; i < arr.length; i++) {
            String line = "";
            for (int j = 0; j < arr[i].length; j++) {
                line += arr[i][j];
            }
            System.out.println(line);
        }

    }
}
}