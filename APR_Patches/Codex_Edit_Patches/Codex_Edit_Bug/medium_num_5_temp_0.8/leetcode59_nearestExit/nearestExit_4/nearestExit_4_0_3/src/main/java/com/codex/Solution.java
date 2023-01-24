package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        // TODO: Write your code here
        int numberOfPaths = findPaths(maze, 0, 0, n);
        return numberOfPaths;
    }

    private static int findPaths(int[][] maze, int row, int col, int n) {
        if(row == n-1 && col == n-1) {
            return 1;
        }

        if(row >= n || col >= n) {
            return 0;
        }

        if(maze[row][col] == -1) {
            return 0;
        }

        int[][] dirs = {{0,1}, {1,0}};
        int count = 0;
        for(int[] dir: dirs) {
            int nextRow = row;
            int nextCol = col;
            while(isSafe(nextRow+dir[0], nextCol+dir[1], maze)) {
                nextRow += dir[0];
                nextCol += dir[1];
            }
            count += findPaths(maze, nextRow, nextCol, n);
        }

        return count;
    }

    private static boolean isSafe(int nextRow, int nextCol, int[][] maze) {
        return nextRow >= 0 && nextRow < maze.length && nextCol >= 0 && nextCol < maze.length && maze[nextRow][nextCol] != -1;
    }

    public static void main(String[] args) {
        int[][] maze = { { 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0 }, { 1, 1, 0, 1, 1 }, { 0, 0, 0, 0, 0 } };
        System.out.println(NumberOfPaths(maze, 5));
    }


        public int shortestPath(int[][] maze) {

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
                while (xx >= 0 && xx < m && yy >= 0 && yy < n && maze[xx][yy] != 1) {
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



        public int shortestPath(int[][] maze) {

        if (maze == null || maze.length == 0 || maze[0].length == 0) {
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
        dist[0][0] = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            for (int[] dir : dirs) {
                int xx = x + dir[0];
                int yy = y + dir[1];
                int count = 0;
                while (xx >= 0 && xx < m && yy >= 0 && yy < n && maze[xx][yy] != 1) {
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
        return dist[m - 1][n - 1] == Integer.MAX_VALUE ? -1 : dist[m - 1][n - 1];
    }

    
    
}