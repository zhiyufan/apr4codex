package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance,int[] exit) {
        
        int[][] dist = new int[maze.length][maze[0].length];
    
        
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
                while (isValid(maze, nextX, nextY) && maze[nextX][nextY] == '.'&&nextX!=exit[0]&&nextY!=exit[1]) {
                    nextX += dx[i];
                    nextY += dy[i];
               
                }
                step++;
                int curDist = dist[cur[0]][cur[1]];
                int nextX1 = nextX - dx[i];
                int nextY1 = nextY - dy[i];
                if (curDist + step < dist[nextX1][nextY1]) {
                    dist[nextX1][nextY1] = curDist + step;
                    q.offer(new int[]{nextX1, nextY1});
                }
            }
        }
      return dist[exit[0]][exit[1]];
    }

    private static boolean isValid(char[][] maze, int i, int j) {
        return i >= 0 && i < maze.length && j >= 0 && j < maze[0].length;
    }

    
}