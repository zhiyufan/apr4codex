package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        if (maze == null || maze.length == 0 || maze[0].length == 0 || entrance == null || entrance.length != 2) {
            return -1;
        }
        
        int m = maze.length;
        int n = maze[0].length;
        int ex = 0; // the exit of row
        int ey = 0; // the exit of column
        int[][] distTo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                distTo[i][j] = Integer.MAX_VALUE;
        }
        distTo[entrance[0]][entrance[1]] = 0;
        bfs(maze, entrance[0], entrance[1], distTo);
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            // if the exit is at the top of the maze
            if (maze[0][j] == '.') {
                min = Math.min(distTo[0][j], min);
                ex = 0;
                ey = j;
            }
            // if the exit is at the bottom of the maze
            if (maze[m - 1][j] == '.') {
                min = Math.min(distTo[m - 1][j], min);
                ex = m - 1;
                ey = j;
            }
        }
        for (int j = 0; j < n; j++) {
            if (maze[0][j] == '.')
                min = Math.min(distTo[0][j], min);
            if (maze[m - 1][j] == '.')
                min = Math.min(distTo[m - 1][j], min);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private static void bfs(char[][] maze, int i, int j, int[][] distTo) {
        int m = maze.length;
        int n = maze[0].length;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : dirs) {
                int x = curr[0];
                int y = curr[1];
                int dist = distTo[curr[0]][curr[1]];
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
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }

    
}