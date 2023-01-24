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
                if (visited[i][j] || land[i][j] != 1) continue;
                List<List<Integer[]>> res = new ArrayList<>();
                dfs(land, visited, i, j, new ArrayList<>(), res);
                int minRow = land.length;
                int minCol = land[0].length;
                int maxRow = 0;
                int maxCol = 0;
                for (List<Integer[]> l : res) {
                    for (Integer[] arr : l) {
                        minRow = Math.min(minRow, arr[0]);
                        minCol = Math.min(minCol, arr[1]);
                        maxRow = Math.max(maxRow, arr[0]);
                        maxCol = Math.max(maxCol, arr[1]);
                    }
                    ls.add(new int[]{minRow, minCol, maxRow, maxCol});
                }
            }
        }
        return ls.toArray(new int[0][0]);
    }

    private static void dfs(int[][] land, boolean[][] visited, int i, int j, List<Integer[]> curr, List<List<Integer[]>> res) {
        if (i < 0 || j < 0 || i >= land.length || j >= land[0].length) return;
        if (visited[i][j] || land[i][j] != 1) return;
        visited[i][j] = true;
        curr.add(new Integer[]{i, j});
        dfs(land, visited, i + 1, j, curr, res);
        dfs(land, visited, i - 1, j, curr, res);
        dfs(land, visited, i, j + 1, curr, res);
        dfs(land, visited, i, j - 1, curr, res);
        if (curr.size() > 0) res.add(curr);
    }

    
}