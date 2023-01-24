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



//
public static String formatString(String str) {

        char[] arr = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetterOrDigit(arr[i]) || Character.isSpaceChar(arr[i])) {
                newStr.append(arr[i]);
            } else {
                continue;
            }
        }
        newStr.replace(0, 1, newStr.substring(0, 1).toUpperCase());
        newStr.replace(newStr.length() - 1, newStr.length(), newStr.substring(newStr.length() - 1, newStr.length()).toUpperCase());
        return newStr.toString();
    }
    
}