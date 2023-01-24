package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        
        if (land == null || land.length < 1) return new int[][]{};
        List<int[]> ls = new ArrayList<>();
        boolean[][] visited = new boolean[land.length][land[0].length];
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (visited[i][j]) continue;
                int minI = land.length;
                int minJ = land[0].length;
                int maxI = 0;
                int maxJ = 0;
                dfs(land, visited, i, j, minI, minJ, maxI, maxJ);
                if (maxI - minI > 0 || maxJ - minJ > 0) {
                    ls.add(new int[]{minI, minJ, maxI, maxJ});
                }
            }
        }
        return ls.toArray(new int[0][0]);
    }
    
    private static void dfs(int[][] land, boolean[][] visited, int i, int j, int minI, int minJ, int maxI, int maxJ) {
        if (i < 0 || j < 0 || i >= land.length || j >= land[i].length || visited[i][j] || land[i][j] != 1) return;
        visited[i][j] = true;
        minI = Math.min(minI, i);
        minJ = Math.min(minJ, j);
        maxI = Math.max(maxI, i);
        maxJ = Math.max(maxJ, j);
        dfs(land, visited, i - 1, j, minI, minJ, maxI, maxJ);
        dfs(land, visited, i + 1, j, minI, minJ, maxI, maxJ);
        dfs(land, visited, i, j - 1, minI, minJ, maxI, maxJ);
        dfs(land, visited, i, j + 1, minI, minJ, maxI, maxJ);
    }

    //BFS
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
                if (maxI - minI > 0 || maxJ - minJ > 0) {
                    ls.add(new int[]{minI, minJ, maxI, maxJ});
                }
            }
        }
        return ls.toArray(new int[0][0]);
    }

    
}