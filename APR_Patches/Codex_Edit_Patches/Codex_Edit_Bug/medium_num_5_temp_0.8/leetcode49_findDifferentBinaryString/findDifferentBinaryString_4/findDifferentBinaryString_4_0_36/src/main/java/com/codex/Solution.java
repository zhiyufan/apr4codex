package com.codex;

import java.util.*;

public class Solution {
public class ShortestPath {

    public int findShortestPath(int[][] matrix, int[] start, int[] dest) {
        if (matrix == null || start == null || dest == null) return 0;
        int distance = 1;
        while (start[0] < matrix.length && start[1] < matrix[0].length) {
            start = move(matrix, start, dest, distance++);
        }
        return dest[0] < matrix.length && dest[1] < matrix[0].length ? distance - 1 : 0;
    }
    
    private int[] move(int[][] matrix, int[] start, int[] dest, int distance) {
        int[][] dirs = new int[][] {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int[] res = new int[2];
        int[] tmp = new int[2];
        for (int i = 0; i < dirs.length; i++) {
            tmp[0] = start[0] + dirs[i][0] * distance;
            tmp[1] = start[1] + dirs[i][1] * distance;
            if (canReach(matrix, tmp, dest)) {
                res[0] = tmp[0];
                res[1] = tmp[1];
                return res;
            }
        }
        return res;
    }
    
    private boolean canReach(int[][] matrix, int[] start, int[] dest) {
        int[][] dirs = new int[][] {{0,1}, {1,0}, {0,-1}, {-1,0}};
        Queue<int[]> q = new LinkedList<int[]>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        q.offer(start);
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == dest[0] && cur[1] == dest[1]) return true;
            for (int i = 0; i < dirs.length; i++) {
                int[] tmp = new int[2];
                tmp[0] = cur[0] + dirs[i][0];
                tmp[1] = cur[1] + dirs[i][1];
                if (tmp[0] < 0 || tmp[0] >= matrix.length || tmp[1] < 0 || tmp[1] >= matrix[0].length || visited[tmp[0]][tmp[1]]) {
                    continue;
                }
                if (matrix[tmp[0]][tmp[1]] == 1) {
                    return false;
                }
                q.offer(tmp);
                visited[tmp[0]][tmp[1]] = true;
            }
        }
        return false;
    }
}
}