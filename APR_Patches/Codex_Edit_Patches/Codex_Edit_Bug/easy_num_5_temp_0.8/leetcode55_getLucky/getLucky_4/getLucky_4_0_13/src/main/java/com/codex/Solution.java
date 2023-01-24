package com.codex;

import java.util.*;

public class Solution {
public static int getLucky(String s, int k) {

        int ans = 0;
        int[] dp = new int[s.length()];
        int ascii = (int) 'a';
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = (int) s.charAt(i) - ascii + 1;
            if (i == s.length() - 1) {
                dp[i] = curr;
            } else {
                dp[i] = dp[i + 1] + curr;
            }
            ans = temp;
            k--;
        }
        return ans;
    }
}