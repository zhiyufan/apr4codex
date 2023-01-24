package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public boolean isOneEditDistance(String s, String t) {

        int N = piles.length;
        int M = t.length();
        if (M > N) return isOneEditDistance(t, s);
        if (N - M > 1) return false;
        if (N == M) {
            int dif = 0;
            for (int i = 0; i < N; i++) {
                if (s.charAt(i) != t.charAt(i)) {
                    dif++;
                }
            }
            return dif == 1;
        }
        for (int i = 0; i < N; i++) {
            dp[i][0] = sum[i];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < i; m++) {
                    int cur = Math.max(dp[m][j-1], sum[i] - sum[m]);
                    dp[i][j] = Math.min(dp[i][j], cur);
                }
            }
        }
        return dp[N-1][k];
    }
}