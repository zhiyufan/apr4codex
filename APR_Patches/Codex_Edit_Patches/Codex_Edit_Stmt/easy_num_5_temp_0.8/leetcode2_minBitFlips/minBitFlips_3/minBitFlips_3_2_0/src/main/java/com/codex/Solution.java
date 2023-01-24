package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        

        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);

        int slen = s.length();
        int glen = g.length();
        if (slen > glen) {
            return -1;
        }

        int p1 = slen - 1;
        int p2 = glen - 1;
        int res = 0;
        boolean flip = false;
        while (p1 >= 0 && p2 >= 0) {
            if (s.charAt(p1) != g.charAt(p2)) {
                if (!flip) {
                    flip = true;
                    res++;
                }
            } else {
                if (flip) {
                    flip = false;
                }
            }
            p1--;
            p2--;
        }
        while (p2 >= 0) {
            if (g.charAt(p2) == '1') {
                if (!flip) {
                    flip = true;
                    res++;
                }
            } else {
                if (flip) {
                    flip = false;
                }
            }
            p2--;
        }

        while (p1 >= 0) {
            if (s.charAt(p1) == '1') {
                if (!flip) {
                    return -1;
                }
            } else {
                if (flip) {
                    flip = false;
                }
            }
            p1--;
        }
        return res;

    public int minCost(int s, int[] cuts) {
        Arrays.sort(cuts);
        int len = cuts.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        int length = cuts[len - 1] - cuts[0];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 0;
            if (i + 1 < len) {
                dp[i][i + 1] = cuts[i + 1] - cuts[i];
            }
        }
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 2; j < len; j++) {
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + cuts[j] - cuts[i]);
                }
            }
        }
        return dp[0][len - 1];
    }
    }

    
}