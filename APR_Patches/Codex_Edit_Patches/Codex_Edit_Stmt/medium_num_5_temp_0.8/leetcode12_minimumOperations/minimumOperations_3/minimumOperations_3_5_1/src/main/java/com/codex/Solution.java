package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  public int numDistinct(String s, String t) {
    if (s == null || t == null) {
      return 0;
    }

    if (s.length() == 0 || t.length() == 0) {
      return 0;
    }
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    int[][] dp = new int[str2.length][str1.length];
    if (str1[0] == str2[0]) {
      dp[0][0] = 1;
    }
    for (int i = 1; i < str2.length; i++) {
      dp[i][0] = 0;
    }
    for (int j = 1; j < str1.length; j++) {
      dp[0][j] = dp[0][j - 1];
      if (str2[0] == str1[j]) {
        dp[0][j]++;
      }
    }
    for (int i = 1; i < str2.length; i++) {
      for (int j = 1; j < str1.length; j++) {
        dp[i][j] = dp[i][j - 1];
        if (str2[i] == str1[j]) {
          dp[i][j] += dp[i - 1][j - 1];
        }
      }
    }
    return dp[str2.length - 1][str1.length - 1];
  }
}
}