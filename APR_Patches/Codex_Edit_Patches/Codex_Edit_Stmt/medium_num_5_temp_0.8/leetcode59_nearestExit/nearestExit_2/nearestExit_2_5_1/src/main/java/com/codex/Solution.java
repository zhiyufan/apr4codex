package com.codex;

import java.util.*;

public class Solution {
// BFS
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        int[][] dist = new int[maze.length][maze[0].length];
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[0].length; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[entrance[0]][entrance[1]] = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(entrance);
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int step = 0;
                int nextX = cur[0] + dx[i];
                int nextY = cur[1] + dy[i];
                while (isValid(maze, nextX, nextY) && maze[nextX][nextY] == '.') {
                    nextX += dx[i];
                    nextY += dy[i];
                    step++;
                }
                int curDist = dist[cur[0]][cur[1]];
                int nextX1 = nextX - dx[i];
                int nextY1 = nextY - dy[i];
                if (curDist + step < dist[nextX1][nextY1]) {
                    dist[nextX1][nextY1] = curDist + step;
                    q.offer(new int[]{nextX1, nextY1});
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < maze.length; i++) {
            if (maze[i][0] == '.' && dist[i][0] < res) {
                res = dist[i][0];
            }
            if (maze[i][maze[0].length - 1] == '.' && dist[i][maze[0].length - 1] < res) {
                res = dist[i][maze[0].length - 1];
            }
        }
        for (int i = 0; i < maze[0].length; i++) {
            if (maze[0][i] == '.' && dist[0][i] < res) {
                res = dist[0][i];
            }
            if (maze[maze.length - 1][i] == '.' && dist[maze.length - 1][i] < res) {
                res = dist[maze.length - 1][i];
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private static boolean isValid(char[][] maze, int i, int j) {
        return i >= 0 && i < maze.length && j >= 0 && j < maze[0].length;
    }

    // DFS
    public class Maze {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            return false;
        }
        int m = maze.length;
        int n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        return helper(maze, start, destination, visited, dirs);
    }
    private boolean helper(int[][] maze, int[] start, int[] destination, 
        boolean[][] visited, int[][] dirs) {
        if (visited[start[0]][start[1]]) {
            return false;
        }
        if (start[0] == destination[0] && start[1] == destination[1]) {
            return true;
        }
        visited[start[0]][start[1]] = true;
        int m = maze.length;
        int n = maze[0].length;
        for (int[] dir : dirs) {
            int x = start[0] + dir[0];
            int y = start[1] + dir[1];
            while (x >= 0 && y >= 0 && x < m && y < n && maze[x][y] == 0) {
                x += dir[0];
                y += dir[1];
            }
            // back 1 step
            x -= dir[0];
            y -= dir[1];
            if (helper(maze, new int[]{x, y}, destination, visited, dirs)) {
                return true;
            }
        }
        return false;
    }
}
}