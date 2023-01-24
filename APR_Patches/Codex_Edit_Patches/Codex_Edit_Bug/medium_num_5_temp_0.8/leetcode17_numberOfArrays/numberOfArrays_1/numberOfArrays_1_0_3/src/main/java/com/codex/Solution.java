package com.codex;

import java.util.*;

public class Solution {
class Solution {
  public int numberOfArrays(String s, int k) {
    int mod = 1000000007;
    char[] sa = s.toCharArray();
    int n = sa.length;
    long[] dp = new long[n + 1];
    dp[n] = 1;
    for (int i = n - 1; i >= 0; i--) {
      if (sa[i] == '0') continue;
      long sum = 0;
      long num = 0;
      for (int j = i; j < n; j++) {
        num = num * 10 + (sa[j] - '0');
        if (num > k) break;
        sum = sum * 10 + (sa[j] - '0');
        dp[i] = (dp[i] + dp[j + 1]) % mod;
      }
      if (num < sum) {
        dp[i] = (dp[i] + dp[i + 1]) % mod;
      }
    }
    return (int)dp[0];
  }
}

class Solution {
    public int maxScore(String s) {
        int n = s.length();
        char[] sa = s.toCharArray();
        int zeros = 0;
        int ones = 0;
        for (char c : sa) {
            if (c == '0') zeros++; else ones++;
        }
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            if (sa[i] == '0') zeros--; else ones--;
            max = Math.max(zeros + ones, max);
        }
        return max;
    }

}

class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int currentMax = 0;
        int currentMin = 0;
        for (int x : A) {
            total += x;
            currentMax = Math.max(currentMax, 0) + x;
            currentMin = Math.min(currentMin, 0) + x;
            max = Math.max(max, currentMax);
            min = Math.min(min, currentMin);
        }
        return max > 0 ? Math.max(max, total - min) : max;
    }
}
}