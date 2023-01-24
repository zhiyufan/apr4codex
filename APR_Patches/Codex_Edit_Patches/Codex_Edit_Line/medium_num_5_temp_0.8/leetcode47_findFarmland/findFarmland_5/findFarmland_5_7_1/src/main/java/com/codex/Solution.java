package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        
        if (land == null || land.length < 1) return new int[][]{};
        Queue<Integer[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[land.length][land[0].length];
        List<int[]> ls = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (land[i][j] == 0) {
                    continue;
                }
                int n = land.length;
                int m = land[0].length;
                int minI = n;
                int minJ = m;
                int maxI = -1;
                int maxJ = -1;
                queue.offer(new Integer[] {i, j});
                while(!queue.isEmpty()) {
                    Integer[] cur = queue.poll();
                    if (visited[cur[0]][cur[1]]) {
                        continue;
                    }
                    if (land[cur[0]][cur[1]] == 0) {
                        continue;
                    }
                    if (minI > cur[0]) {
                        minI = cur[0];
                    }
                    if (minJ > cur[1]) {
                        minJ = cur[1];
                    }
                    if (maxI < cur[0]) {
                        maxI = cur[0];
                    }
                    if (maxJ < cur[1]) {
                        maxJ = cur[1];
                    }
                    visited[cur[0]][cur[1]] = true;
                    if (cur[0] - 1 >= 0) {
                        queue.offer(new Integer[] {cur[0] - 1, cur[1]});
                    }
                    if (cur[1] - 1 >= 0) {
                        queue.offer(new Integer[] {cur[0], cur[1] - 1});
                    }
                    if (cur[0] + 1 < n) {
                        queue.offer(new Integer[] {cur[0] + 1, cur[1]});
                    }
                    if (cur[1] + 1 < m) {
                        queue.offer(new Integer[] {cur[0], cur[1] + 1});
                    }
                }
                ls.add(new int[] {minI, minJ, maxI, maxJ});
            }
        }
        return ls.toArray(new int[0][0]);
    }

    
}