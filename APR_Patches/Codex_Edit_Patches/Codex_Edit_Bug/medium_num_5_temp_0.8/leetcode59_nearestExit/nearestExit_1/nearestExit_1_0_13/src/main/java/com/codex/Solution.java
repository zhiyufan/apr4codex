package com.codex;

import java.util.*;

public class Solution {
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
        int m = maze.length;
        int n = maze[0].length;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y, 0));
        while (queue.size() != 0) {
            Node curr = queue.poll();
            for (int i = 0; i < dirs.length; i++) {
                int nx = curr.x;
                int ny = curr.y;
                int dist = curr.dist;
                while (nx >= 0 && nx < m && ny >= 0 && ny < n && maze[nx][ny] == '.') {
                    nx += dirs[i][0];
                    ny += dirs[i][1];
                    dist++;
                }
                nx -= dirs[i][0];
                ny -= dirs[i][1];
                dist--;
                if (distTo[nx][ny] > dist)
                    queue.offer(new Node(nx, ny, dist));
            }
        }
    }
    static class Node {
        int x;
        int y;
        int dist;
        
        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    
}