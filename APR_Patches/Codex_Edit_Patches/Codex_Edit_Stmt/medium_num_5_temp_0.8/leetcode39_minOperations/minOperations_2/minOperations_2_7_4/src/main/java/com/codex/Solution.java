package com.codex;

import java.util.*;

public class Solution {
    public static int maxNumberOfApples(int[] arr) {
       
        // sort
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 5000) {
                return i;
            }
        }
        return arr.length;
    }

    
    public static int countSubstrings(String s) {
         int n = s.length(), res = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            res++;
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                res++;
            }
        }
        for (int l = 3; l <= n; l++) {
            for (int j = 0; j + l - 1 < n; j++) {
                if (dp[j + 1][j + l - 2] && s.charAt(j) == s.charAt(j + l - 1)) {
                    dp[j][j + l - 1] = true;
                    res++;
                }
            }    
        }
        if ((max - min) % (x * (m * n)) != 0) {
            return -1;
        }
        if (max == min) {
            return 0;
        }
        int cnt = Math.max(0, (max - min) / (x * (m * n)));
        int average = (max + x * cnt * (m * n)) / (m * n);
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result += Math.abs(grid[i][j] - average);
            }
        }
        return result / x;
    }

    
}