package com.codex;

import java.util.*;

public class Solution {
   public int countNumbersWithUniqueDigits(int n) {
        int sum = 1;
        long mod = 1000000007;
        for (int i = 1; i < n; i++) {
            long product = 9;
            for (int j = 0; j < i; j++) {
                product = (product * (10 - j - 1)) % mod;
            }
            sum = (int) ((sum + product) % mod);
        }
        return (int) dp[differences.length][1];
    }

    
}