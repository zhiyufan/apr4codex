package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public int countPalindromicSubsequence(String s) {

      int len = s.length();

      int[][] dp = new int[len][len];

      for (int i = 0; i < len - 2; i++) {

        for (int j = i + 2; j < len; j++) {

          if (s.charAt(i) == s.charAt(j)) {

            dp[i][j] = dp[i + 1][j - 1] + 1;

          } else {

            dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];

          }

        }

      }

      return dp[0][len - 1];

    }

  }
}