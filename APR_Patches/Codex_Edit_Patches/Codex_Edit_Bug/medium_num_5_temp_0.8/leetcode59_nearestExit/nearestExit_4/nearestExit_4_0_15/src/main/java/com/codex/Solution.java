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

    class PQY{
        int x , y , dist ; 
        PQY (int x ,int y , int dist) {
            this.x = x ;
            this.y = y ; 
            this.dist = dist ; 
        }
    }
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        if (maze == null || maze.length == 0 || maze[0].length == 0) return -1 ;
        int m = maze.length , n = maze[0].length , dirs[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        int[][] dist = new int[m][n];
        for (int i = 0 ; i < m ; i ++) {
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[start[0]][start[1]] = 0 ; 
        Queue<PQY> pq = new PriorityQueue<>((a,b) -> a.dist - b.dist) ;
        pq.offer(new PQY(start[0],start[1],0));
        
        while(!pq.isEmpty()) {
            PQY cur = pq.poll() ;
            if (cur.x == destination[0] && cur.y == destination[1]) return cur.dist ;
            for (int[] dir : dirs) {
                int nx = cur.x , ny = cur.y , d = cur.dist ; 
                while (nx+dir[0] >= 0 && nx+dir[0] < m && ny+dir[1] >= 0 && ny+dir[1] < n && maze[nx+dir[0]][ny+dir[1]] == 0) {
                    nx += dir[0] ; 
                    ny += dir[1] ; 
                    d ++ ; 
                }
                if (d < dist[nx][ny]) {
                    dist[nx][ny] = d ; 
                    pq.offer(new PQY(nx,ny,d));
                }
            }
        }
        return dist[destination[0]][destination[1]] == Integer.MAX_VALUE ? -1 : dist[destination[0]][destination[1]] ; 
    }
    
    
}