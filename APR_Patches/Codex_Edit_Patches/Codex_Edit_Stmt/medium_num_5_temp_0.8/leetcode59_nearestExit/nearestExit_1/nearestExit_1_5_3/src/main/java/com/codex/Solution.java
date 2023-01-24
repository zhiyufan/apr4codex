package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {

        if (maze.length == 0 || maze[0].length == 0)
            return 0;

        int[][] distTo = new int[maze.length][maze[0].length];
        for (int[] row : distTo)
            Arrays.fill(row, Integer.MAX_VALUE);
        distTo[entrance[0]][entrance[1]] = 0;
        bfs(maze, entrance[0], entrance[1], distTo);

        int min = distTo[0][0];
        for (int i = 0; i < distTo.length; i++) {
            if (maze[i][0] == '.' || maze[i][distTo[i].length - 1] == '.') {
                min = Math.min(min, Math.min(distTo[i][0], distTo[i][distTo[i].length - 1]));
            }
        }
        for (int j = 0; j < distTo[0].length; j++) {
            if (maze[0][j] == '.' || maze[distTo.length - 1][j] == '.') {
                min = Math.min(min, Math.min(distTo[0][j], distTo[distTo.length - 1][j]));
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
}