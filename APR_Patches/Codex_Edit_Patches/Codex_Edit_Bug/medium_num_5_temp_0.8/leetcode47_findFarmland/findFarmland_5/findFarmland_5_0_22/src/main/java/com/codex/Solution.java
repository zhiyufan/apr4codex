package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
    //I am not sure if it is possible to write BFS/DFS in a short way
    //If you have better solution, please post it as a comment
        
        if (land == null || land.length == 0 || land[0].length == 0) return new int[][]{};
        int m = land.length;
        int n = land[0].length;
        
        boolean[][] visited = new boolean[m][n];
        List<int[]> ls = new ArrayList<int[]>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 0 || visited[i][j]) continue;
                int minX = m;
                int minY = n;
                int maxX = 0;
                int maxY = 0;
                Queue<int[]> queue = new LinkedList<>();
                queue.add(new int[]{i, j});
                while (!queue.isEmpty()) {
                    int[] curr = queue.poll();
                    if (visited[curr[0]][curr[1]]) continue;
                    visited[curr[0]][curr[1]] = true; //VERY IMPORTANT!!!
                    minX = Math.min(minX, curr[0]);
                    minY = Math.min(minY, curr[1]);
                    maxX = Math.max(maxX, curr[0]);
                    maxY = Math.max(maxY, curr[1]);
                    if (curr[0] - 1 >= 0 && land[curr[0] - 1][curr[1]] != 0 && !visited[curr[0] - 1][curr[1]]) {
                        queue.add(new int[]{curr[0] - 1, curr[1]});
                    }
                    if (curr[1] - 1 >= 0 && land[curr[0]][curr[1] - 1] != 0 && !visited[curr[0]][curr[1] - 1]) {
                        queue.add(new int[]{curr[0], curr[1] - 1});
                    }
                    if (curr[0] + 1 < m && land[curr[0] + 1][curr[1]] != 0 && !visited[curr[0] + 1][curr[1]]) {
                        queue.add(new int[]{curr[0] + 1, curr[1]});
                    }
                    if (curr[1] + 1 < n && land[curr[0]][curr[1] + 1] != 0 && !visited[curr[0]][curr[1] + 1]) {
                        queue.add(new int[]{curr[0], curr[1] + 1});
                    }
                }
                if (maxI - minI > 0 || maxJ - minJ > 0) {
                    //System.out.println(minI + " " + minJ + " " + maxI + " " + maxJ);
                    ls.add(new int[]{minI, minJ, maxI, maxJ});
                }
            }
        }
        return ls.toArray(new int[0][0]);
    }
}