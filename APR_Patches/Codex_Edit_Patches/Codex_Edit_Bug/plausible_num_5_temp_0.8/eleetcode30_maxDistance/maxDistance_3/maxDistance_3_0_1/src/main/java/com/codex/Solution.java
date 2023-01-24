package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int maxDistance(int[][] grid) {
        int N = grid.length;
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        Queue<int[]> queue = new LinkedList();
        for (int r = 0; r < N; ++r)
            for (int c = 0; c < N; ++c)
                if (grid[r][c] == 1)
                    queue.add(new int[]{r, c});

        //Then update the max distance based on the neighbors of the nearest land that are water.
        boolean hasOcean = false;
        int[] point = null;
        while (!queue.isEmpty()) {
            point = queue.poll();
            int r = point[0], c = point[1];
            for (int k = 0; k < 4; ++k) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (nr < 0 || nr >= N || nc < 0 || nc >= N || grid[nr][nc] != 0)
                    continue;
                grid[nr][nc] = grid[r][c] + 1; // add 1 to its distance
                hasOcean = true;
                queue.add(new int[]{nr, nc});
            }
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;
    }

    
}