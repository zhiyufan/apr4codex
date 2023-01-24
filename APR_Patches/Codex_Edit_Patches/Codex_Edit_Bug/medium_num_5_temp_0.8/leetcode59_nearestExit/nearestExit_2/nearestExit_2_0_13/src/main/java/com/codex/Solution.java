package com.codex;

import java.util.*;

public class Solution {
static int[][] dirs = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};

  private boolean dfs(char[][] maze, int[] start, int[] dest, boolean[][] visited) {
    if (start[0] == dest[0] && start[1] == dest[1]) {
      return true;
    }

    int m = maze.length;
    int n = maze[0].length;
    visited[start[0]][start[1]] = true;

    for (int[] dir : dirs) {
      int x = start[0];
      int y = start[1];
      while (x >= 0 && y >= 0 && x < m && y < n && maze[x][y] == '.') {
        x += dir[0];
        y += dir[1];
      }
      x -= dir[0];
      y -= dir[1];
      if (visited[x][y]) {
        continue;
      }
      if (dfs(maze, new int[]{x, y}, dest, visited)) {
        return true;
      }
    }

    return false;
  }
}