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
                if (visited[i][j]) continue;
                int minI = land.length;
                int minJ = land[0].length;
                int maxI = 0;
                int maxJ = 0;
                queue.offer(new Integer[]{i, j});
                while (!queue.isEmpty()) {
                    Integer[] temp = queue.poll();
                    if (land[temp[0]][temp[1]] != 1 || visited[temp[0]][temp[1]]) continue;
                    visited[temp[0]][temp[1]] = true;
                    minI = Math.min(minI, temp[0]);
                    minJ = Math.min(minJ, temp[1]);
                    maxI = Math.max(maxI, temp[0]);
                    maxJ = Math.max(maxJ, temp[1]);
                    if (temp[0] - 1 >= 0 && !visited[temp[0] - 1][temp[1]]) {
                        queue.offer(new Integer[]{temp[0] - 1, temp[1]});
                    }
                    if (temp[1] - 1 >= 0 && !visited[temp[0]][temp[1] - 1]) {
                        queue.offer(new Integer[]{temp[0], temp[1] - 1});
                    }
                    if (temp[0] + 1 < land.length && !visited[temp[0] + 1][temp[1]]) {
                        queue.offer(new Integer[]{temp[0] + 1, temp[1]});
                    }
                    if (temp[1] + 1 < land[temp[0]].length && !visited[temp[0]][temp[1] + 1]) {
                        queue.offer(new Integer[]{temp[0], temp[1] + 1});
                    }
                }
                if (maxI - minI > 0 || maxJ - minJ > 0) {
                    ls.add(new int[]{minI, minJ, maxI, maxJ});
                }
            }
        }
        return ls.toArray(new int[0][0]);
    }

    
}