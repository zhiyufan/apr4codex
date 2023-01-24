package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Solution {
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};

    public static int minOperations(int n, int[][] mines) {
        int[][] grid = new int[n][n];
        for (int[] mine : mines) {
            grid[mine[0]][mine[1]] = -1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) continue;
                for (int k = 0; k < 4; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] != -1) {
                        grid[i][j] += 1;
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    ans = Math.min(ans, minOperations(grid, grid[i][j]));
                }
            }
        }
        return ans;
    }


    public static int minOperations(int[][] grid, int x) {
        

        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x) continue;
                if (grid[i][j] < x) {
                    if ((x - grid[i][j]) % x != 0) return -1;
                    numberOfOperations += (x - grid[i][j]) / x;
                } else {
                    if ((grid[i][j] - x) % x != 0)  return -1;
                    numberOfOperations += (grid[i][j] - x) / x;
                }
            }
        }
        return numberOfOperations;
    }
    
    public static void main(String[] args) {
        int[][] grid = { {1,1,1} , {2,2,2}, {3,3,3} };
        System.out.println(minOperations(grid, 2));
    }
}
    
}