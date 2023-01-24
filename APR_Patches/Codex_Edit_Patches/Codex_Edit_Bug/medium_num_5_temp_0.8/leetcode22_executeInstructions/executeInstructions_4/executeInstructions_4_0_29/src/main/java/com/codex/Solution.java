package com.codex;

import java.util.*;

public class Solution {
    // Complete the executeInstructions function below.
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        StringBuilder sb = new StringBuilder();
        int[][] grid = new int[n][n];
        int[] ans = new int[s.length()];

        int[] pos = Arrays.copyOf(startPos, startPos.length);
        boolean canMove = true;
        for (int i = 0; i < s.length(); i++) {      
            int row = pos[0];
            int col = pos[1];
            if (s.charAt(i) == 'L') {
                if (col == 0 || grid[row][col - 1] == 1) {
                    canMove = false;
                    break;
                } else {
                    pos[1]--;
                    grid[row][col - 1] = 1;
                    sb.append(s.charAt(i));
                }
            } else if (s.charAt(i) == 'R') {
                if (col == n - 1 || grid[row][col + 1] == 1) {
                    canMove = false;
                    break;
                } else {
                    pos[1]++;
                    grid[row][col + 1] = 1;
                    sb.append(s.charAt(i));
                }
            } else if (s.charAt(i) == 'U') {
                if (row == 0 || grid[row - 1][col] == 1) {
                    canMove = false;
                    break;
                } else {
                    pos[0]--;
                    grid[row - 1][col] = 1;
                    sb.append(s.charAt(i));
                }

            } else if (s.charAt(i) == 'D') {
                if (row == n - 1 || grid[row + 1][col] == 1) {
                    canMove = false;
                    break;
                } else {
                    pos[0]++;
                    grid[row + 1][col] = 1;
                    sb.append(s.charAt(i));
                }
            }
        }
        if (canMove) {
            ans[0] = sb.length();
        }
        return ans;
    }
}