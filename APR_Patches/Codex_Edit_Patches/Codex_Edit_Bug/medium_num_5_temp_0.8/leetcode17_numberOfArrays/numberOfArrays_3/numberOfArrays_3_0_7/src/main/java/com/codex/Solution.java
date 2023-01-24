package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  public int numberOfArrays(String s, int k) {
    long mod = 1000000007;
    long[][] dp = new long[s.length() + 1][2];
    dp[0][0] = 1;
    dp[0][1] = 1;
    for (int i = 1; i < s.length() + 1; i++) {
      if (s.charAt(i - 1) == '0') {
        dp[i][0] = 0;
        dp[i][1] = 0;
      } else if (s.charAt(i - 1) > '0' && s.charAt(i - 1) <= ('0' + k)) {
        dp[i][0] = (dp[i][0] + dp[i - 1][0]) % mod;
        dp[i][1] = (dp[i][1] + dp[i - 1][0]) % mod;
        dp[i][1] = (dp[i][1] + dp[i - 1][1]) % mod;
      } else {
        dp[i][0] = (dp[i][0] + dp[i - 1][0]) % mod;
        dp[i][1] = (dp[i][1] + dp[i - 1][1]) % mod;
      }
    }

    return (int) dp[s.length()][1];
  }
}
}