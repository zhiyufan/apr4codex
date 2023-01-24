package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int nearestExit(char[][] maze) {
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            return 0;
        }

        int n = maze.length;
        int m = maze[0].length;
        int[] dx = new int[]{0,0,-1,1};
        int[] dy = new int[]{1,-1,0,0};
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        boolean[][] visit = new boolean[n][m];
        visit[0][0] = true;
        
        int res = 0;
        
        while (!q.isEmpty()) {
            int size = q.size();
            res++;
            
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                for (int j = 0; j < 4; j++) {
                    int x = cur[0];
                    int y = cur[1];
                    while (x >= 0 && x < n && y >=0 && y < m && maze[x][y] != '+') {
                        x += dx[j];
                        y += dy[j];
                    }
                    //!can't take one step back or it will be a loop
                    if (x == cur[0] && y == cur[1]) continue;
                    x -= dx[j];
                    y -= dy[j];

                    if (x == n - 1 && y == m - 1) return res;
                    if (visit[x][y]) continue;
                    q.offer(new int[]{x, y});
                    visit[x][y] = true;

                }
            }
            level++;
        }
        return -1;
    }

    
}