package com.codex;

import java.util.*;

public class Solution {
public static int countVowelSubstrings(String word) {
        int l = word.length();
        int[][] dp = new int[l+1][5];
        int a = 0, e = 1, i = 2, o = 3, u = 4;
        for (int j = 0; j < l; j++) {
            char c = word.charAt(j);
            if(c == 'a') {
                dp[j+1][a] = dp[j][a] + 1;
                dp[j+1][e] = dp[j][e] + 1;
                dp[j+1][i] = dp[j][i] + 1;
                dp[j+1][o] = dp[j][o] + 1;
                dp[j+1][u] = dp[j][u] + 1;
            }
            else if(c == 'e') {
                dp[j+1][e] = dp[j][e] + 1;
                dp[j+1][i] = dp[j][i] + 1;
                dp[j+1][o] = dp[j][o] + 1;
                dp[j+1][u] = dp[j][u] + 1;
            }
            else if(c == 'i') {
                dp[j+1][i] = dp[j][i] + 1;
                dp[j+1][o] = dp[j][o] + 1;
                dp[j+1][u] = dp[j][u] + 1;
            }
            else if(c == 'o') {
                dp[j+1][o] = dp[j][o] + 1;
                dp[j+1][u] = dp[j][u] + 1;
            }
            else if(c == 'u') {
                dp[j+1][u] = dp[j][u] + 1;
            }
        }

        int count = 0;
        for (int j = 1; j <= l; j++) {
            count += dp[j][a] * dp[l][e - a] * dp[l][i - e] * dp[l][o - i] * dp[l][u - o];
        }

        return (count+l);
    }
}