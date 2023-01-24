package com.codex;

import java.util.*;

public class Solution {
  public int minKnightMoves(int x, int y) {
    x = Math.abs(x);
    y = Math.abs(y);
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 0);
    map.put(1, 3);
    map.put(2, 2);
    return dfs(x, y, map);
  }
  int[][] dirs = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};

  private int dfs(int x, int y, Map<Integer, Integer> map) {
    int key = x * 400 + y;
    if (map.containsKey(key)) return map.get(key);
    int res = Integer.MAX_VALUE;
    for (int[] dir : dirs) {
      int nextX = x - dir[0];
      int nextY = y - dir[1];
      if (nextX < 0 || nextY < 0) continue;
      int temp = dfs(nextX, nextY, map);
      if (temp != Integer.MAX_VALUE) res = Math.min(res, temp + 1);
    }

    map.put(key, res);
    return res;
  }
}