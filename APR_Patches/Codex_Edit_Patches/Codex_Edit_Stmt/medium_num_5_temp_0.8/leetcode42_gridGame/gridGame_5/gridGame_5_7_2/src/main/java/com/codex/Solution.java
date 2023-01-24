package com.codex;

import java.util.*;

public class Solution {
int[][] gridGame(int[][] grid, int k, String[] rules) {
        int n = grid.length;
        int m = grid[0].length;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while (k-- > 0) {
            int[][] temp = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int d = 0; d < 4; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                            temp[i][j] += grid[nx][ny];
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (rules[temp[i][j]].equals("alive")) {
                        grid[i][j] = 1;
                    } else {
                        grid[i][j] = 0;
                    }
                }
            }
        }
        return grid;
    }
}