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

        public static int[] closestPair(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] res = new int[2];
        int p1 = 0, p2 = 0;
        int min = Integer.MAX_VALUE;
        while (p1 < m && p2 < n) {
            min = Math.min(min, Math.abs(arr1[p1] - arr2[p2]));
            if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        p1 = 0;
        p2 = 0;
        while (p1 < m && p2 < n) {
            if (Math.abs(arr1[p1] - arr2[p2]) == min) {
                res[0] = arr1[p1];
                res[1] = arr2[p2];
                return res;
            }
            if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return res;
    }
    }

    public static int closestPair(int[] arr1, int[] arr2, int k1, int k2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] res = new int[2];
        if (m == 0 || n == 0)
            return Integer.MAX_VALUE;
        if (k1 >= m)
            return arr2[k2 + 1];
        if (k2 >= n)
            return arr1[k1 + 1];
        return Math.min(arr1[k1 + 1], arr2[k2 + 1]);
    }


    
}