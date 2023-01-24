package com.codex;

import java.util.*;

public class Solution {
  //Solution
  public static int[][] findFarmland(int[][] land) {
    if (land.length == 0 || land == null) return new int[0][0];
    Queue<Integer[]> queue = new LinkedList<>();
    boolean[][] visited = new boolean[land.length][land[0].length];
    List<int[]> ls = new ArrayList<>();
    for (int i = 0; i < land.length; i++) {
      for (int j = 0; j < land[i].length; j++) {
        if (land[i][j] == 0 || visited[i][j]) continue;
        int minI = i;
        int minJ = j;
        int maxI = i;
        int maxJ = j;
        queue.offer(new Integer[]{i, j});
        while (!queue.isEmpty()) {
          Integer[] curr = queue.poll();
          if (land[curr[0]][curr[1]] == 0 || visited[curr[0]][curr[1]]) continue;
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
        ls.add(new int[]{minI, minJ, maxI, maxJ});
      }
    }

  }
}