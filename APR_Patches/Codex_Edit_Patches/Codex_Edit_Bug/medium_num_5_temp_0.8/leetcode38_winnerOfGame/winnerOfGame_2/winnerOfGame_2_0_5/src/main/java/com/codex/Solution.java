package com.codex;

import java.util.*;

public class Solution {
public class Test {

    public static void main(String[] args) {
        String str = "sljhfafhieo";
        String pattern = "afh*o";
        Test test = new Test();
        boolean res = test.isMatch(str, pattern);
        System.out.println(res);
    }

    public boolean isMatch(String s, String p) {
        s = " " + s;
        p = " " + p;
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n][m];
        dp[0][0] = true;
        for (int i = 1; i < m; i++) {
            if (p.charAt(i) == '*') {
                dp[0][i] = dp[0][i - 1];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        int cur = (n - 1) % 2, pre = (n - 2) % 2;
        return dp[cur][n] <= dp[pre][n - 1];
    }

    
}