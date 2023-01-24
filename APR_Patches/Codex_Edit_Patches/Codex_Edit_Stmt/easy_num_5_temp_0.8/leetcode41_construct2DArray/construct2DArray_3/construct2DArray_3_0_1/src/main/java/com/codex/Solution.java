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

    public static String getStringEdition(String original, String edition, int n) {
        String result = original;
        int currentLength = 0;
        int index = 0;
        while (currentLength < n) {
            if (index >= original.length()) {
                return "";
            }
            String s = String.valueOf(original.charAt(index));
            if (s.equals(edition)) {
                result = result.replace(s, "");
            } else {
                index += 1;
            }
            currentLength += 1;
        }
        return result;
    }
}