package com.codex;

import java.util.*;

public class Solution {
    class Solution {
      public int minimumOperations(String leaves) {
          int len = leaves.length();
          int[][] dp = new int[3][len];
          for (int i = 0; i < len; i++) {
              dp[0][i] = leaves.charAt(i) == 'y' ? (i==0?1:dp[0][i-1]+1) : i;
              if (i > 0) { // dp[1][i]有i-1的影响
                  dp[1][i] = leaves.charAt(i) == 'r' ? dp[1][i-1] : dp[0][i-1];
              }
              if (i > 1) { // dp[2][i]有i-1和i-2的影响
                  dp[2][i] = leaves.charAt(i) == 'r' ? dp[2][i-1] : dp[1][i-1];
              }
          }
          return dp[2][len - 1];
      }
  }
        

    
}