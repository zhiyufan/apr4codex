package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] start) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(start);
        int level = 0;
        boolean[][] visited = new boolean[maze.length][maze[0].length]; // default false
        visited[start[0]][start[1]] = true;


        while (!queue.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                int[] cur = q.poll();
                if (cur[0] == 0 || cur[1] == 0 || cur[0] == maze.length - 1 || cur[1] == maze[0].length - 1) {
                    return level;
                }
                
                // expand
                for (int[] direction : new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}) {
                    int r = cur[0];
                    int c = cur[1];
                    while (r + direction[0] >= 0 && r + direction[0] < maze.length && c + direction[1] >= 0 && c + direction[1] < maze[0].length && maze[r + direction[0]][c + direction[1]] != '+') {
                        r += direction[0];
                        c += direction[1];
                    } 
                    if (visited[r][c]) continue;
                    q.offer(new int[]{r, c});
                    visited[r][c] = true;
                }
                size--;
            }
            level++;
        }
        return -1;
    }

    
}