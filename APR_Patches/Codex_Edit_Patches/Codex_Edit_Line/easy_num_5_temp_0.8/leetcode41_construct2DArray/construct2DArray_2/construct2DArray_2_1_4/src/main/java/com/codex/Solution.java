package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i * n + j < original.length) {
                    result[i][j] = original[i * n + j];
                }
            }
        }
        return result;

        public static boolean isPrime(int num) {
        if (num == 1 || num == 4 || num == 6 || num == 8 || num == 9) {
            return false;
        }
        if (num == 2 || num == 3 || num == 5 || num == 7) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            return false;
        }
        if (num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            return false;
        }
        for (long i = 11; i * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    }

    
}