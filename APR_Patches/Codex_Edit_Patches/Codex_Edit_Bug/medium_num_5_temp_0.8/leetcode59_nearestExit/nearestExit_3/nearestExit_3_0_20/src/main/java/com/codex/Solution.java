package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] cur = queue.poll();
                int r = cur[0];
                int c = cur[1];

                for (int[] d : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
                    int i = r, j = c;
                    while (i + d[0] >= 0 && j + d[1] >= 0 && i + d[0] < maze.length && j + d[1] < maze[0].length && maze[i + d[0]][j + d[1]] != '+') {
                        i += d[0];
                        j += d[1];
                    }
                    if (!visited[i][j]) {
                        queue.offer(new int[]{i, j});
                        visited[i][j] = true;
                    }
                }
            }
            level++;
        }
        return -1;
    }

    
}