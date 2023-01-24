package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        if (original.length < m * n) {
            return new int[0][0];
        }
        int[][] arr = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[index];
                index += 1;
            }
        }
        return arr;
    }

    public static int[][] concat(int[][] arr1, int[][] arr2) {
        if (arr1.length == 0) {
            return arr2;
        } else if (arr2.length == 0) {
            return arr1;
        }
        int[][] result;
        if (arr1[0].length == arr2[0].length) {
            result = new int[arr1.length + arr2.length][arr1[0].length];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    result[i][j] = arr1[i][j];
                }
            }
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    result[i + arr1.length][j] = arr2[i][j];
                }
            }
        } else {
            result = new int[0][0];
        }
        return result;
    }
}