package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            return -1;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        int level = 0;
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[entrance[0]][entrance[1]] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] cur = queue.poll();
                int r = cur[0];
                int c = cur[1];

                int cc = c;
                while (r - 1 >= 0 && maze[r - 1][cc] != '+') {
                    r--;
                }
                if (r == 0) {
                    return level;
                }

                r = cur[0];
                cc = c;
                while (r + 1 < maze.length && maze[r + 1][cc] != '+') {
                    r++;
                }
                if (r == maze.length - 1) {
                    return level;
                }

                r = cur[0];
                cc = c;
                while (cc - 1 >= 0 && maze[r][cc - 1] != '+') {
                    cc--;
                }
                if (cc == 0) {
                    return level;
                }

                r = cur[0];
                cc = c;
                while (cc + 1 < maze[0].length && maze[r][cc + 1] != '+') {
                    cc++;
                }
                if (cc == maze[0].length - 1) {
                    return level;
                }

                r = cur[0];
                cc = c;
                while (r - 1 >= 0 && maze[r - 1][cc] != '+') {
                    r--;
                    if (!visited[r][cc]) {
                        queue.offer(new int[]{r, cc});
                        visited[r][cc] = true;
                    }
                }

                r = cur[0];
                cc = c;
                while (r + 1 < maze.length && maze[r + 1][cc] != '+') {
                    r++;
                    if (!visited[r][cc]) {
                        queue.offer(new int[]{r, cc});
                        visited[r][cc] = true;
                    }
                }

                r = cur[0];
                cc = c;
                while (cc - 1 >= 0 && maze[r][cc - 1] != '+') {
                    cc--;
                    if (!visited[r][cc]) {
                        queue.offer(new int[]{r, cc});
                        visited[r][cc] = true;
                    }
                }

                r = cur[0];
                cc = c;
                while (cc + 1 < maze[0].length && maze[r][cc + 1] != '+') {
                    cc++;
                    if (!visited[r][cc]) {
                        queue.offer(new int[]{r, cc});
                        visited[r][cc] = true;
                    }
                }
            }
            level++;
        }
        return -1;
    }

    
}