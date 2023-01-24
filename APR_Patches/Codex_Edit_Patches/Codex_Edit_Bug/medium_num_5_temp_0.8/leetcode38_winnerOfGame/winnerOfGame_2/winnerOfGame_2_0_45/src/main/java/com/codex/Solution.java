package com.codex;

import java.util.*;

public class Solution {
public boolean winnerOfGame(String colors) {
    int[] dp = new int[3];
    if (colors == null || colors.length() == 0) {
        return false;
    }

    if (colors.length() == 1) {
        return true;
    }
    int n = colors.length();
    for (int i = 1, m = 0; i <= n; i++) {
        int temp = dp[1];
        dp[1] = Math.min(dp[0] + (colors.charAt(i - 1) == 'B' ? 1 : 0), dp[1] + (colors.charAt(i - 1) == 'A' ? 1 : 0));
        dp[0] = m + (colors.charAt(i - 1) == 'B' ? 1 : 0);
        m = temp;
    }
    return dp[1] <= dp[2];
}

}