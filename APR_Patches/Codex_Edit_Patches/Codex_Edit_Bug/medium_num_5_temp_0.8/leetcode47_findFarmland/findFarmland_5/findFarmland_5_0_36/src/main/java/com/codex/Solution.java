package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        
        if (land == null || land.length < 1) return new int[][]{};
        int i = 0, j = 0;
        Queue<Integer[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[land.length][land[0].length];
        List<Integer[]> ls = new ArrayList<>();
        while (j < land[0].length) {
            while (i < land.length) {
                if (visited[i][j]) continue;
                int minI = Integer.MAX_VALUE;
                int minJ = Integer.MAX_VALUE;
                int maxI = Integer.MIN_VALUE;
                int maxJ = Integer.MIN_VALUE;
                boolean found = false;
                queue.offer(new Integer[]{i, j});
                while (!queue.isEmpty()) {
                    Integer[] curr = queue.poll();
                    if (visited[curr[0]][curr[1]] || land[curr[0]][curr[1]] != 1) continue;
                    found = true;
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
                if (found) {
                    Integer[] ar = new Integer[]{minI, minJ, maxI, maxJ};
                    ls.add(ar);
                }
                i++;
            }
            i = 0;
            j++;
        }
        int[][] res = new int[ls.size()][4];
        for (int k = 0; k < ls.size(); k++) {
            Integer[] ar = ls.get(k);
            for (int l = 0; l < 4; l++) {
                res[k][l] = ar[l];
            }
        }
        return res;
    }
}