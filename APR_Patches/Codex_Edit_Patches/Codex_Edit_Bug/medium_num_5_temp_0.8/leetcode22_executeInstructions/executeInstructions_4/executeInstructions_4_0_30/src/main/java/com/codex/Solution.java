package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[][] grid = new int[n][n];
        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char dir = s.charAt(i);
            int[] pos = Arrays.copyOf(startPos, startPos.length);
            if (dir == 'L') {
                if (pos[1] > 0 && grid[pos[0]][pos[1] - 1] == 0) {
                    pos[1]--;
                    grid[pos[0]][pos[1]] = 1;
                    ans[i] = i + 1;
                }
            } else if (dir == 'R') {
                if (pos[1] < n - 1 && grid[pos[0]][pos[1] + 1] == 0) {
                    pos[1]++;
                    grid[pos[0]][pos[1]] = 1;
                    ans[i] = i + 1;
                }
            } else if (dir == 'U') {
                if (pos[0] > 0 && grid[pos[0] - 1][pos[1]] == 0) {
                    pos[0]--;
                    grid[pos[0]][pos[1]] = 1;
                    ans[i] = i + 1;
                }
            } else if (dir == 'D') {
                if (pos[0] < n - 1 && grid[pos[0] + 1][pos[1]] == 0) {
                    pos[0]++;
                    grid[pos[0]][pos[1]] = 1;
                    ans[i] = i + 1;
                }
            }
            int[] pos = Arrays.copyOf(startPos, startPos.length);
            boolean canMove = true;
            for (int j = 0; j < dir.length; j++) {
                int row = pos[0];
                int col = pos[1];
                if (dir[j] == 'L') {
                    if (col == 0 || grid[row][col - 1] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[1]--;
                        grid[row][col - 1] = 1;
                    }
                } else if (dir[j] == 'R') {
                    if (col == n - 1 || grid[row][col + 1] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[1]++;
                        grid[row][col + 1] = 1;
                    }
                } else if (dir[j] == 'U') {
                    if (row == 0 || grid[row - 1][col] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[0]--;
                        grid[row - 1][col] = 1;
                    }

                } else if (dir[j] == 'D') {
                    if (row == n - 1 || grid[row + 1][col] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[0]++;
                        grid[row + 1][col] = 1;
                    }
                }
            }
            if (canMove) {
                ans[i] = dir.length;
            }
        }
        return ans;
    }

    
}