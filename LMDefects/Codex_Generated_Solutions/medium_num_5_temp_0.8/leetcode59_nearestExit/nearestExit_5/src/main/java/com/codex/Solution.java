package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        /** You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.') and walls (represented as '+'). You are also given the entrance of the maze, where entrance = [entrancerow, entrancecol] denotes the row and column of the cell you are initially standing at.
         * In one step, you can move one cell up, down, left, or right. You cannot step into a cell with a wall, and you cannot step outside the maze. Your goal is to find the nearest exit from the entrance. An exit is defined as an empty cell that is at the border of the maze. The entrance does not count as an exit.
         * Return the number of steps in the shortest path from the entrance to the nearest exit, or -1 if no such path exists.
         */

        int[][] steps = new int[maze.length][maze[0].length];
        for (int i = 0; i < steps.length; i++) for (int j = 0; j < steps[0].length; j++) steps[i][j] = Integer.MAX_VALUE;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(entrance);
        steps[entrance[0]][entrance[1]] = 0;
        int[][] dirs = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : dirs) {
                int x = curr[0] + dir[0], y = curr[1] + dir[1];
                if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length) continue;
                if (maze[x][y] == '+') continue;
                if (steps[x][y] <= steps[curr[0]][curr[1]]) continue;
                steps[x][y] = steps[curr[0]][curr[1]] + 1;
                queue.add(new int[]{x, y});
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < maze.length; i++) {
            min = Math.min(min, steps[i][0]);
            min = Math.min(min, steps[i][steps[0].length - 1]);
        }
        for (int j = 0; j < maze[0].length; j++) {
            min = Math.min(min, steps[0][j]);
            min = Math.min(min, steps[steps.length - 1][j]);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    /**
    int res = Integer.MAX_VALUE;
    }