package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[entrance[0]][entrance[1]] = true;
        int level = 0;

            int level_size = queue.size();

            while (level_size-- > 0) {
                int[] curr = queue.poll();
                int i = curr[0];
                int j = curr[1];
                if (maze[i][j] == 'E') {
                    return level;
                }
                for (int[] dir : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
                    int ii = i, jj = j;
                    // 一直走到一个+或者出界阻止
                    while (inBound(maze, ii + dir[0], jj + dir[1]) && maze[ii + dir[0]][jj + dir[1]] != '+') {
                        ii += dir[0];
                        jj += dir[1];
                    }
                    if (!visited[ii][jj]) {
                        queue.offer(new int[]{ii, jj});
                        visited[ii][jj] = true;
                    }
                }
            }
            level++;
        }
        return -1;
    }
    

    private static boolean inBound(char[][] maze, int i, int j) {
        return i >= 0 && i < maze.length && j >= 0 && j < maze[0].length;
    }
    
    
    
    
        public static int nearestExit(char[][] maze, int[] entrance) {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[entrance[0]][entrance[1]] = true;
        int level = 0;

        while (!queue.isEmpty()) {
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                if (r == 0 || c == 0 || r == maze.length - 1 || c == maze[0].length - 1) {
                    return level;
                }

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