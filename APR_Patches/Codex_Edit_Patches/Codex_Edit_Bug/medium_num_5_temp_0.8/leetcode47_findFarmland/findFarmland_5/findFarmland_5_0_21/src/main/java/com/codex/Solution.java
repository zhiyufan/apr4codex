package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        
        if (land == null || land.length < 1) return new int[][]{};
        Queue<Integer[]> queue = new LinkedList<>();
        Set<Integer[]> set = new HashSet<>();
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
                visited[i][j] = true;
                while (!queue.isEmpty()) {
                    Integer[] curr = queue.poll();
                    if (land[curr[0]][curr[1]] != 1) continue;
                    if (visited[curr[0]][curr[1]]) continue;
                    minI = Math.min(minI, curr[0]);
                    minJ = Math.min(minJ, curr[1]);
                    maxI = Math.max(maxI, curr[0]);
                    maxJ = Math.max(maxJ, curr[1]);
                    visited[curr[0]][curr[1]] = true;
                    if (curr[0] - 1 >= 0) {
                        queue.offer(new Integer[]{curr[0] - 1, curr[1]});
                        set.add(new Integer[]{curr[0] - 1, curr[1]});
                    }
                    if (curr[1] - 1 >= 0) {
                        queue.offer(new Integer[]{curr[0], curr[1] - 1});
                        set.add(new Integer[]{curr[0], curr[1] - 1});
                    }
                    if (curr[0] + 1 < land.length) {
                        queue.offer(new Integer[]{curr[0] + 1, curr[1]});
                        set.add(new Integer[]{curr[0] + 1, curr[1]});
                    }
                    if (curr[1] + 1 < land[curr[0]].length) {
                        queue.offer(new Integer[]{curr[0], curr[1] + 1});
                        set.add(new Integer[]{curr[0], curr[1] + 1});
                    }
                }
                for (Integer[] temp : set) {
                    visited[temp[0]][temp[1]] = true;
                }
                if (maxI - minI > 0 || maxJ - minJ > 0) {
                    ls.add(new int[]{minI, minJ, maxI, maxJ});
                }
            }
        }
        return ls.toArray(new int[0][0]);
    }

    
}