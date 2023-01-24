package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Solution {

  private static long gridGame(int[][] grid) {

    int n = grid[0].length;
    int[][] dp = new int[n][n];
    for (int i = n - 1; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        if (j == 0) {
          dp[i][j] = grid[0][i] + grid[1][j] + dp[i - 1][j];
        } else {
          dp[i][j] = grid[0][i] + grid[1][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
    return dp[n - 1][n - 2];
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      b[i] = in.nextInt();
    }
    int[][] grid = new int[][]{a, b};
    System.out.println(gridGame(grid));
    in.close();
  }
}
    
}