package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        if (maze == null || maze[0] == null || maze.length == 0 || maze[0].length == 0) {
            return 0;
        }
        int m = maze.length;
        int n = maze[0].length;
        int[][] dist = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[entrance[0]][entrance[1]] = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            for (int[] dir : dirs) {
                int xx = x + dir[0];
                int yy = y + dir[1];
                int count = 0;
                while (xx >= 0 && xx < m && yy >= 0 && yy < n && maze[xx][yy] != '+') {
                    xx += dir[0];
                    yy += dir[1];
                    count++;
                }
                if (dist[x][y] + count < dist[xx - dir[0]][yy - dir[1]]) {
                    dist[xx - dir[0]][yy - dir[1]] = dist[x][y] + count;
                    queue.offer(new int[]{xx - dir[0], yy - dir[1]});
                }
            }
        }
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            minDist = Math.min(minDist, dist[i][0]);
            minDist = Math.min(minDist, dist[i][n - 1]);
        }
        for (int i = 0; i < n; i++) {
            minDist = Math.min(minDist, dist[0][i]);
            minDist = Math.min(minDist, dist[m - 1][i]);
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

    // Fix "minDist = Math.min(minDist, dist[i][0]);"
    public int maxPoints(Point[] points) {
        
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        int result = 0;
        
        for (int i = 0; i < points.length; i++) {
            map.clear();
            int duplicate = 0;
            for (int j = i + 1; j < points.length; j++) {
                int dx = points[j].x - points[i].x;
                int dy = points[j].y - points[i].y;
                
                if (dx == 0 && dy == 0) {
                    duplicate++;
                    continue;
                }
                
                int d = gcd(dx, dy);
                dx /= d;
                dy /= d;
                
                if (map.containsKey(dx)) {
                    if (map.get(dx).containsKey(dy)) {
                        map.get(dx).put(dy, map.get(dx).get(dy) + 1);
                    }
                    else {
                        map.get(dx).put(dy, 1);
                    }
                }
                else {
                    Map<Integer, Integer> m = new HashMap<>();
                    m.put(dy, 1);
                    map.put(dx, m);
                }
            }
            result = Math.max(result, duplicate);
            for (Map.Entry<Integer, Map<Integer, Integer>> entry : map.entrySet()) {
                for (Map.Entry<Integer, Integer> entry2 : entry.getValue().entrySet()) {
                    result = Math.max(result, entry2.getValue() + duplicate + 1);
                }
            }
        }
        
        return result;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
    
}