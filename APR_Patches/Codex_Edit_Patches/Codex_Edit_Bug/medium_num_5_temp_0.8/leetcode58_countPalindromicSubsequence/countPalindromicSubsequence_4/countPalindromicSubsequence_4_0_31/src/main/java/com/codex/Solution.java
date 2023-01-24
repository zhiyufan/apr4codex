package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
<<<<<<< HEAD
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 2; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    set.add(s.substring(i, j + 1));
                }
            }
        }
        return set.size();
    }

=======
        if (n < 4) {
            return n - 1;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for (int i = 4; i < n; i++) {
            dp[i] = getSum(dp, i - 1);
        }
        return dp[n - 1];
    }
>>>>>>> 6e283b478d9b7c8f0e389bf646b7d1bdb0bcd8c8
    
}