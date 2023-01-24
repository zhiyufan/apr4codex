package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        
        if (land == null || land.length < 1) return new int[][]{};
        Queue<Integer[]> queue = new LinkedList<>();

        boolean[][] visited = new boolean[land.length][land[0].length];

        List<int[]> ls = new ArrayList<>();
        int[][] dirs = new int[][] {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

        for (int i = 0; i < land.length; i++) {

            if (visited[i][0]) continue;

            for (int j = 0; j < land[i].length; j++) {

                 if (visited[i][j]) continue;

                int minI = land.length;
                int minJ = land[0].length;
                int maxI = 0;
                int maxJ = 0;


                queue.offer(new Integer[]{i, j});
                visited[i][j] = true;
                minI = Math.min(minI, i);
                minJ = Math.min(minJ, j);
                maxI = Math.max(maxI, i);
                maxJ = Math.max(maxJ, j);


                while (!queue.isEmpty()) {
                    Integer[] curr = queue.poll();
                    if (curr == null) continue;
                    if (land[curr[0]][curr[1]] != 1 || visited[curr[0]][curr[1]]) continue;
                    visited[curr[0]][curr[1]] = true;

                    //System.out.println("curr " + curr[0] + " " + curr[1]);

                    minI = Math.min(minI, curr[0]);
                    minJ = Math.min(minJ, curr[1]);
                    maxI = Math.max(maxI, curr[0]);
                    maxJ = Math.max(maxJ, curr[1]);


                    for (int[] dir : dirs) {
                        int nextRow = curr[0] + dir[0];
                        int nextCol = curr[1] + dir[1];
                        if (nextRow >= 0 && nextRow < land.length && nextCol >= 0 && nextCol < land[0].length && !visited[nextRow][nextCol]) {
                            queue.offer(new Integer[]{nextRow, nextCol});
                            visited[nextRow][nextCol] = true;
                        }
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