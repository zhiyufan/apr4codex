package com.codex;

import java.util.*;

public class Solution {
public class Solution {

  public int maxSquare(int[][] matrix) {
    // Write your solution here
    int row = matrix.length;
    int col = matrix[0].length;
    int[][] dp = new int[row][col];
    int max = 0;
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        if(i == 0 || j == 0)
          dp[i][j] = matrix[i][j];
        else{
          if(matrix[i][j] != 0){
            dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
          }
        }
        max = Math.max(max, dp[i][j]);
      }
    }
    return max*max;
  }
}
}