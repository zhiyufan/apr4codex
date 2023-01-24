package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        if (maze.length == 0 || maze[0].length == 0)
            return -1;
        int m = maze.length;
        int n = maze[0].length;
        int[][] distTo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                distTo[i][j] = Integer.MAX_VALUE;
        }
        distTo[entrance[0]][entrance[1]] = 0;
        dfs(maze, entrance[0], entrance[1], distTo);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if (maze[i][0] == '.')
                min = Math.min(distTo[i][0], min);
            if (maze[i][n - 1] == '.')
                min = Math.min(distTo[i][n - 1], min);
        }
        for (int j = 0; j < n; j++) {
            if (maze[0][j] == '.')
                min = Math.min(distTo[0][j], min);
            if (maze[m - 1][j] == '.')
                min = Math.min(distTo[m - 1][j], min);
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    private static void dfs(char[][] maze, int i, int j, int[][] distTo) {
        int m = maze.length;
        int n = maze[0].length;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int[] dir : dirs) {
            int x = i;
            int y = j;
            int dist = distTo[i][j];
            while (x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == '.') {
                x += dir[0];
                y += dir[1];
                dist++;
            }
            x -= dir[0];
            y -= dir[1];
            dist--;
            if (distTo[x][y] > dist) {
                distTo[x][y] = dist;
                if (maze[x][y] == '.') {
                    dfs(maze, x, y, distTo);
                }
            }
        }
    }

    
}