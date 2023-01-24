package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        
        if (land == null || land.length == 0 || land[0].length == 0) return new int[0][0];
        Queue<Integer[]> queue = new LinkedList<>();
        List<int[]> ls = new ArrayList<>();    
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (land[i][j] == 1) {
                    int minI = land.length - 1;
                    int minJ = land[0].length - 1;
                    int maxI = 0;
                    int maxJ = 0;
                    queue.offer(new Integer[]{i, j});
                    while (!queue.isEmpty()) {
                        Integer[] curr = queue.poll();
                        land[curr[0]][curr[1]] = 0;
                        minI = Math.min(minI, curr[0]);
                        minJ = Math.min(minJ, curr[1]);
                        maxI = Math.max(maxI, curr[0]);
                        maxJ = Math.max(maxJ, curr[1]);
                        if (curr[0] - 1 >= 0 && land[curr[0] - 1][curr[1]] == 1) {
                            queue.offer(new Integer[]{curr[0] - 1, curr[1]});
                        }
                        if (curr[1] - 1 >= 0 && land[curr[0]][curr[1] - 1] == 1) {
                            queue.offer(new Integer[]{curr[0], curr[1] - 1});
                        }
                        if (curr[0] + 1 < land.length && land[curr[0] + 1][curr[1]] == 1) {
                            queue.offer(new Integer[]{curr[0] + 1, curr[1]});
                        }
                        if (curr[1] + 1 < land[curr[0]].length && land[curr[0]][curr[1] + 1] == 1) {
                            queue.offer(new Integer[]{curr[0], curr[1] + 1});
                        }
                    }
                    ls.add(new int[]{minI, minJ, maxI, maxJ});                               
                }
            }
        }
        return ls.toArray(new int[ls.size()][4]);
    }

    
}