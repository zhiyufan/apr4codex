package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param maze: the maze
     * @param start: the start
     * @param destination: the destination
     * @return: Whether the ball could stop at the destination
     */
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
                
        if (maze.length == 0 || maze[0].length == 0) {
            return false;
        }
        if (start[0] == destination[0] && start[1] == destination[1]) {
            return true;
        }
        int m = maze.length;
        int n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                visited[i][j] = false;
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

    private static void bfs(char[][] maze, int i, int j, int[][] distTo) {
        int m = maze.length;
        int n = maze[0].length;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : dirs) {
                int x = curr[0];
                int y = curr[1];
                int dist = distTo[curr[0]][curr[1]];
                while (x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == '.') {
                    x += dir[0];
                    y += dir[1];
                    dist++;
                }
                x -= dir[0];
                y -= dir[1];
                dist--;
                if (distTo[x][y] > dist) {
                    distTo[x][y] = dist;
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }

    
}