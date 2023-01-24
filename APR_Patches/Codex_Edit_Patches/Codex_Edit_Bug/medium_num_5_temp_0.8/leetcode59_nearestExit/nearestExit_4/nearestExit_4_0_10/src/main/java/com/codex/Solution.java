package com.codex;

import java.util.*;

public class Solution {















    public static int nearestExit(char[][] maze, int[] entrance) {
        
        if (maze == null || maze[0] == null || maze.length == 0 || maze[0].length == 0) {
            return 0;
        }
        int m = maze.length;
        int n = maze[0].length;
        int[][] dist = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[entrance[0]][entrance[1]] = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            for (int[] dir : dirs) {
                int xx = x + dir[0];
                int yy = y + dir[1];
                int count = 0;
                while (xx >= 0 && xx < m && yy >= 0 && yy < n && maze[xx][yy] != '+') {
                    xx += dir[0];
                    yy += dir[1];
                    count++;
                }
                if (dist[x][y] + count < dist[xx - dir[0]][yy - dir[1]]) {
                    dist[xx - dir[0]][yy - dir[1]] = dist[x][y] + count;
                    queue.offer(new int[]{xx - dir[0], yy - dir[1]});
                }
            }
        }
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            minDist = Math.min(minDist, dist[i][0]);
            minDist = Math.min(minDist, dist[i][n - 1]);
        }
        for (int i = 0; i < n; i++) {
            minDist = Math.min(minDist, dist[0][i]);
            minDist = Math.min(minDist, dist[m - 1][i]);
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }


    private static int[][] dist;
    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private static final double[][] DIRS_D = {{0, 1}, {0, -1}, {-0.5, 0.5}, {-0.5, -0.5}};
    private int m, n;
    private char[][] maze;
    
    public int minDistance(char[][] maze, int[] start, int[] destination) {
        if (maze == null || maze[0] == null || maze.length == 0 || maze[0].length == 0 ||
            start == null || start.length != 2 || destination == null || destination.length != 2) {
            return 0;
        }
        m = maze.length;
        n = maze[0].length;
        dist = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[start[0]][start[1]] = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            if (x == destination[0] && y == destination[1]) {
                break;
            }
            for (int[] dir : DIRS) {
                int xx = x + dir[0];
                int yy = y + dir[1];
                int count = 0;
                while (xx >= 0 && xx < m && yy >= 0 && yy < n && maze[xx][yy] != '#') {
                    xx += dir[0];
                    yy += dir[1];
                    count++;
                }
                xx -= dir[0];
                yy -= dir[1];
                if (dist[x][y] + count < dist[xx][yy]) {
                    dist[xx][yy] = dist[x][y] + count;
                    queue.offer(new int[]{xx, yy});
                }
            }
            // diagonal
            for (double[] dir : DIRS_D) {
                int xx = x;
                int yy = y;
                int count = 0;
                while (xx >= 0 && xx < m - 1 && yy >= 0 && yy < n - 1 && maze[(int) xx][(int) yy] != '#' &&
                        maze[(int) xx + 1][(int) yy] != '#' && maze[(int) xx][(int) yy + 1] != '#') {
                    xx += dir[0];
                    yy += dir[1];
                    count += 2;
                }
                if (dist[x][y] + count < dist[(int) xx][(int) yy]) {
                    dist[(int) xx][(int) yy] = dist[x][y] + count;
                    queue.offer(new int[]{(int) xx, (int) yy});
                }
            }
        }
        
        return dist[destination[0]][destination[1]];
    }
    
}