package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        int step = 0;
        for (int i = 0; i < t.length(); i++) {
            if (hash[t.charAt(i) - 'a'] == 0) {
                step++;
            } else {
                hash[t.charAt(i) - 'a']--;
            }
        }
        return step;
    }

    private static void printMatrix(int[][] mat) {
        for (int[] ar : mat) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        if (len1 == 0) {
            return len2;
        }
        if (len2 == 0) {
            return len1;
        }
        int[][] mat = new int[len1][len2];
        for (int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    mat[i][j] = (i - 1 == -1 || j - 1 == -1) ? 1 : mat[i-1][j-1] + 1;
                } else {
                    mat[i][j] = Math.max((i - 1 == -1) ? 0 : mat[i-1][j], (j - 1 == -1) ? 0 : mat[i][j-1]);
                }
            }
        }
        printMatrix(mat);
        return (len1 + len2) - mat[len1 - 1][len2 - 1] * 2;
    }
}