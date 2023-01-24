package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            return 0;
        }
        int m = maze.length;
        int n = maze[0].length;
        int[][] dist = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1]});
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        dist[entrance[0]][entrance[1]] = 0;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : dirs) {
                int nx = curr[0];
                int ny = curr[1];
                int currDist = dist[curr[0]][curr[1]];
                while (nx >= 0 && nx < m && ny >= 0 && ny < n && maze[nx][ny] != '#') {
                    nx += dir[0];
                    ny += dir[1];
                    currDist++;
                }
                nx -= dir[0];
                ny -= dir[1];
                currDist--;
                if (dist[nx][ny] > currDist) {
                    queue.offer(new int[]{nx, ny});
                    dist[nx][ny] = currDist;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if (maze[i][0] == '.') {
                min = Math.min(min, dist[i][0]);
            }
            if (maze[i][n - 1] == '.') {
                min = Math.min(min, dist[i][n - 1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (maze[0][i] == '.') {
                min = Math.min(min, dist[0][i]);
            }
            if (maze[m - 1][i] == '.') {
                min = Math.min(min, dist[m - 1][i]);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }


























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

    
}