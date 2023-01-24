package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        

        int N = piles.length;
        int [][] dp = new int[N][k+1];
        int [] sum = new int[N];
        sum[0] = piles[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i-1] + piles[i];
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
    public int minInteger(String num, int k) {
        int N = num.length();
        int [] index = new int[10];
        for (int i = 0; i < N; i++) {
            index[num.charAt(i) - '0']++;
        }
        
        StringBuffer sb = new StringBuffer();
        if (k == 0) {
            return Integer.parseInt(num);
        }
        for (int i = 1; i <= 9; i++) {
            if (k > index[i]) {
                k -= index[i];
            } else {
                for (int j = i; j <= 9; j++) {
                    for (int m = 0; m < index[j]; m++) {
                        int candidate = Integer.parseInt(sb.toString() + num.charAt(m));
                        if (candidate <= k) {
                            k -= candidate;
                            sb.append(num.charAt(m));
                            index[j]--;
                        }
                    }
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}