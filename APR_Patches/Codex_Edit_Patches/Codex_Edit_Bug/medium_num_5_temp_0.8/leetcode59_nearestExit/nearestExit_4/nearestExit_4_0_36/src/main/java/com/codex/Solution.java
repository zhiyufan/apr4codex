package com.codex;

import java.util.*;

public class Solution {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        
        return bfs(maze, start, destination);
    }


    private int bfs(int[][] maze, int[] start, int[] destination) {
        
        Set<String> visited = new HashSet<>();
        visited.add(start[0] + ":" + start[1]);
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(start[0], start[1], 0));
        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            if (cur.x == destination[0] && cur.y == destination[1]) {
                return cur.distance;
            }
            for (int[] dirs : dirs) {
                int xx = cur.x;
                int yy = cur.y;
                int len = cur.distance;
                while (xx >= 0 && xx < maze.length && yy >= 0 && yy < maze[0].length && maze[xx][yy] == 0) {
                    xx += dirs[0];
                    yy += dirs[1];
                    len++;
                }
                xx -= dirs[0];
                yy -= dirs[1];
                len--;
                if (!visited.contains(xx + ":" + yy)) {
                    visited.add(xx + ":" + yy);
                    queue.offer(new Point(xx, yy, len));
                }
            }
        }
        
        return -1;
    }

    class Point {
        int x;
        int y;
        int distance;
        Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    private int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
}
}