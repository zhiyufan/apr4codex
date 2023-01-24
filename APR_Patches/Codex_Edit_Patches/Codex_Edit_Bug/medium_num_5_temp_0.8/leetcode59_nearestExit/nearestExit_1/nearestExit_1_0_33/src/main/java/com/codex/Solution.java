package com.codex;

import java.util.*;

public class Solution {
public class ShortestPath {

	public static int nearestExit(char[][] maze, int[] entrance) {
        if (maze.length == 0 || maze[0].length == 0)
            return -1;
        int m = maze.length;
        int n = maze[0].length;
        int[][] distTo = new int[m][n];
        distTo[entrance[0]][entrance[1]] = 0;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                distTo[i][j] = Integer.MAX_VALUE;
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