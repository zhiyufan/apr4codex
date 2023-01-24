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
                    Integer[] curr = queue.poll();
                    if (land[curr[0]][curr[1]] != 1 || visited[curr[0]][curr[1]]) continue;
                    visited[curr[0]][curr[1]] = true;
                    minI = Math.min(minI, curr[0]);
                    minJ = Math.min(minJ, curr[1]);
                    maxI = Math.max(maxI, curr[0]);
                    maxJ = Math.max(maxJ, curr[1]);
                    if (curr[0] - 1 >= 0 && !visited[curr[0] - 1][curr[1]]) {
                        queue.offer(new Integer[]{curr[0] - 1, curr[1]});
                    }
                    if (curr[1] - 1 >= 0 && !visited[curr[0]][curr[1] - 1]) {
                        queue.offer(new Integer[]{curr[0], curr[1] - 1});
                    }
                    if (curr[0] + 1 < land.length && !visited[curr[0] + 1][curr[1]]) {
                        queue.offer(new Integer[]{curr[0] + 1, curr[1]});
                    }
                    if (curr[1] + 1 < land[curr[0]].length && !visited[curr[0]][curr[1] + 1]) {
                        queue.offer(new Integer[]{curr[0], curr[1] + 1});
                    }
                }
                ls.add(new int[]{minI - 1, minJ - 1, maxI + 1, maxJ + 1});
            }
        }
        return ls.toArray(new int[0][0]);
    }

    
}