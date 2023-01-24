package com.codex;

import java.util.*;

public class Solution {
    public int maximumMinimumPath(int[][] A) {
        int rows = A.length, cols = A[0].length;
         int [][] min = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                min[i][j] = Integer.MAX_VALUE;
            }
        }    
        min[rows-1][cols-1] = A[rows-1][cols-1];
        Queue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                int diff = b[0] - a[0];
                if (diff == 0) {
                    return a[2] - b[2];
                } else {
                    return diff;
                }
            }
        }
        });
        pq.offer(new int[] {A[rows-1][cols-1], rows-1, cols-1});
        int [][] dirs = {{0, 1}, {0, -1}, {-1, 0}, {1,0}};
        int res = Integer.MAX_VALUE;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int val = cur[0], row = cur[1], col = cur[2];
            res = Math.min(res, val);
            for (int [] d : dirs) {
                int r = row + d[0], c = col + d[1];
                if (0 <= r && r < rows && 0 <= c && c < cols && min[r][c] != Integer.MAX_VALUE) {
                    continue;
                }
                min[r][c] = Math.min(min[r][c], A[r][c]);
                pq.offer(new int[] {A[r][c], r, c});
            }
        }
        return dp[N-1][k];
       
    }
}