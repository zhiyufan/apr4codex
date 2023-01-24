package com.codex;

import java.util.*;

public class Solution {
    private static final int[][] DIRS = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

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


    private static void bfs(char[][] maze, int x, int y, int[][] distTo) {
        int row = maze.length;
        int col = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];
            int dist = distTo[i][j];
            for (int[] dir : DIRS) {
                int ii = i;
                int jj = j;
                while (ii >= 0 && ii < row && jj >= 0 && jj < col && maze[ii][jj] == '.') {
                    ii += dir[0];
                    jj += dir[1];
                }
                if (distTo[ii - dir[0]][jj - dir[1]] > dist + 1) {
                    distTo[ii - dir[0]][jj - dir[1]] = dist + 1;
                    queue.offer(new int[]{ii - dir[0], jj - dir[1]});
                }
            }
        }
    }
}
}