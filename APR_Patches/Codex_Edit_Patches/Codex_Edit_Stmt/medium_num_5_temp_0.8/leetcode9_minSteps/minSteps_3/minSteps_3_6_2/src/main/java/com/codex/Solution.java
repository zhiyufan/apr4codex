package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] letters = new int[26];
        int res = 0;
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        for (int i : letters) {
            res += Math.abs(i);
        }
        return res / 2;
    }

public List<Integer> luckyNumbers (int[][] matrix) {
        int[] minRow = new int[matrix.length];
        int[] maxCol = new int[matrix[0].length];
        
        for (int i = 0; i < matrix.length; i++) {
            int currMin = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                currMin = Math.min(matrix[i][j], currMin);
            }
            minRow[i] = currMin;
        }
        
        for (int i = 0; i < matrix[0].length; i++) {
            int currMax = 0;
            for (int j = 0; j < matrix.length; j++) {
                currMax = Math.max(matrix[j][i], currMax);
            }
            maxCol[i] = currMax;
        }
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) {
                    res.add(matrix[i][j]);
                }
            }
        }
        
        return res;
    }

    
    
}