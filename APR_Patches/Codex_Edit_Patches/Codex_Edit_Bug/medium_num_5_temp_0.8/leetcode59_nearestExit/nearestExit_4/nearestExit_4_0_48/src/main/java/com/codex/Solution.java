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
        for (int i = 0; i < m; i++) 
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        dist[entrance[0]][entrance[1]] = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(entrance);
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            for (int[] dir : dirs) {
                int xx = x + dir[0];
                int yy = y + dir[1];
                int count = 0;
                if (dist[x][y] == Integer.MAX_VALUE) {
                    return -1;
                }
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

    
}