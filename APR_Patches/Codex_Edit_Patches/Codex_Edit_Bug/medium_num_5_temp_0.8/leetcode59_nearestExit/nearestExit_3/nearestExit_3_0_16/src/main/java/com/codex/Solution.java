package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        if (maze == null || maze.length == 0 || maze[0] == null || maze[0].length == 0 || entrance == null || entrance.length == 0) {
            return -1;
        }
        int len = maze.length, width = maze[0].length;
        if (entrance[0] < 0 || entrance[0] >= len || entrance[1] < 0 || entrance[1] >= width) {
            return -1;
        }
        int[][] pos = new int[len * width][2];
        pos[0] = entrance;
        boolean[][] visited = new boolean[len][width];
        visited[entrance[0]][entrance[1]] = true;   
        int i = 0, j = 1;

        while (i < j) {
            int[] cur = pos[i++];
            int r = cur[0], c = cur[1];

            if (r == 0 || r == len - 1 || c == 0 || c == width - 1) {
                return i;
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