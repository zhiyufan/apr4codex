package com.codex;

import java.util.*;

public class Solution {

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0) {
            int[] result = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                result[i] = i;
            }
            return result;
        }
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
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