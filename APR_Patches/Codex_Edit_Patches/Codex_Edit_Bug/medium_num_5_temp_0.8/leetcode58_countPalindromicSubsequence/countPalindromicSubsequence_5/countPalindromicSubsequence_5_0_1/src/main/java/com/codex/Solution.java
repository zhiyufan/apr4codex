package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        if (s == null || s.length() < 3) {
            return 0;
        }
        int res = 0;
        int n = s.length();
        int[][] sTable = new int[n][n];
        // 这里为了方便，表格初始化的时候，从1～n-1开始
        for (int j = 1; j < n; j++) {
            sTable[j - 1][j] = 0;
            for (int i = j - 2; i >= 0; i--) {
                if (s.charAt(i) == s.charAt(j)) {
                    sTable[i][j] = sTable[i + 1][j - 1] + 1;
                } else {
                    sTable[i][j] = Math.max(sTable[i + 1][j], sTable[i][j - 1]);
                }
            }
        }
        return res;
    }

    
}