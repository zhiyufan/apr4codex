package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        
        if (land == null || land.length < 1) return new int[][]{};
        
        boolean[][] visited = new boolean[land.length][land[0].length];
        int minI = land.length;
        int minJ = land[0].length;
        int maxI = 0;
        int maxJ = 0;
        List<int[]> ls = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (visited[i][j]) continue;

                minI = i;
                minJ = j;
                maxI = i;
                maxJ = j;
                getRectangle(visited, land, i, j, minI, minJ, maxI, maxJ);
                if (minI <= maxI && minJ <= maxJ) {
                    ls.add(new int[]{minI, minJ, maxI, maxJ});    
                }
            }
        }
        if (minI <= maxI && minJ <= maxJ) ls.add(new int[]{minI, minJ, maxI, maxJ});
        return ls.toArray(new int[0][0]);
    }

    }

    private static void getRectangle(boolean[][] visited, int[][] land, int i, int j, int minI, int minJ, int maxI, int maxJ) {
        if (i < 0 || i >= land.length || j < 0 || j >= land[i].length || visited[i][j] || land[i][j] == 0) return;
        minI = Math.min(minI, i);
        minJ = Math.min(minJ, j);
        maxI = Math.max(maxI, i);
        maxJ = Math.max(maxJ, j);
        visited[i][j] = true;
        getRectangle(visited, land, i + 1, j, minI, minJ, maxI, maxJ);
        getRectangle(visited, land, i - 1, j, minI, minJ, maxI, maxJ);
        getRectangle(visited, land, i, j + 1, minI, minJ, maxI, maxJ);
        getRectangle(visited, land, i, j - 1, minI, minJ, maxI, maxJ);
    }
}