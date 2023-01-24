package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {

        int n = bank.length;
        int[] notUsed = new int[n];
        Arrays.fill(notUsed, -1);
        int[] dp = new int[1 << n];
        dp[0] = 0;
        for (int i = 0; i < 1 << n; i++) {
            if (dp[i] == 0) {
                dp[i] = -1;
                continue;
            }
            int cur = Integer.bitCount(i);
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) == 0)
                    dp[i + (1 << j)] = update(dp[i + (1 << j)], cur);
            }
        }
        return beams;
    }

    
}