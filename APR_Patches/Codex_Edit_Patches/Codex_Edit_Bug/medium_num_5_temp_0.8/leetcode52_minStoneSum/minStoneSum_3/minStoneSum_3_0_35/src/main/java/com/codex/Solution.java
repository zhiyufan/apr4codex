package com.codex;

import java.util.*;

public class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger+1) / 2 < desiredTotal) return false;
        return canIWin(maxChoosableInteger, desiredTotal, 0, new HashMap<>());
    }
    
    private boolean canIWin(int length, int total, int used, Map<Integer, Boolean> map) {
        if (map.containsKey(used)) return map.get(used);
        for (int i = 0; i < length; i++) {
            int cur = (1 << i);
            if ((cur & used) != 0) continue;
            if (total <= i + 1 || !canIWin(length, total - (i + 1), cur | used, map)) {
                map.put(used, true);
                return true;
            }
        }
        map.put(used, false);
        return false;
    }















































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
}