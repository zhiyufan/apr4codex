package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        if (maze.length == 0 || maze[0].length == 0)
            return 0;
        int m = maze.length;
        int n = maze[0].length;
        int[][] distTo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                distTo[i][j] = Integer.MAX_VALUE;
        }
        distTo[entrance[0]][entrance[1]] = 0;
        bfs(maze, entrance[0], entrance[1], distTo);
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
  public static int shortestPath(List<List<Integer>> grid, int k) {
        // Write your solution here
        int m = grid.size();
        int n = grid.get(0).size();
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            if (x == m - 1 && y == n - 1)
                return dp[x][y];
            int dist = dp[x][y];
            int val = grid.get(x).get(y);
            if (x + 1 < m && dp[x + 1][y] > dist + 1) {
                int temp = grid.get(x + 1).get(y);
                if (val >= temp) {
                    dp[x + 1][y] = dist + 1;
                    queue.offer(new int[]{x + 1, y});
                } else if (k >= val + 1) {
                    dp[x + 1][y] = dist + 1 + val + 1;
                    queue.offer(new int[]{x + 1, y});
                }
            }
            if (x - 1 >= 0 && dp[x - 1][y] > dist + 1) {
                int temp = grid.get(x - 1).get(y);
                if (val >= temp) {
                    dp[x - 1][y] = dist + 1;
                    queue.offer(new int[]{x - 1, y});
                } else if (k >= val + 1) {
                    dp[x - 1][y] = dist + 1 + val + 1;
                    queue.offer(new int[]{x - 1, y});
                }
            }
            if (y + 1 < n && dp[x][y + 1] > dist + 1) {
                int temp = grid.get(x).get(y + 1);
                if (val >= temp) {
                    dp[x][y + 1] = dist + 1;
                    queue.offer(new int[]{x, y + 1});
                } else if (k >= val + 1) {
                    dp[x][y + 1] = dist + 1 + val + 1;
                    queue.offer(new int[]{x, y + 1});
                }
            }
            if (y - 1 >= 0 && dp[x][y - 1] > dist + 1) {
                int temp = grid.get(x).get(y - 1);
                if (val >= temp) {
                    dp[x][y - 1] = dist + 1;
                    queue.offer(new int[]{x, y - 1});
                } else if (k >= val + 1) {
                    dp[x][y - 1] = dist + 1 + val + 1;
                    queue.offer(new int[]{x, y - 1});
                }
            }
        }
        return -1;

    }
    
}