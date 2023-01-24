package com.codex;

import java.util.*;

public class Solution {
    @Test
    public void test() {
        int[][] land = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };
        Assert.assertArrayEquals(new int[][]{}, findFarmland(land));
    }

    public int[][] findFarmland(int[][] land) {
        int[][] res = new int[0][0];
        if (land == null || land.length == 0) return res;
        boolean[][] visited = new boolean[land.length][land[0].length];
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                int[] curr = helper(land, i, j, visited);
                if (curr != null) {
                    list.add(curr);
                }
            }
        }
        return list.toArray(res);
    }

    private int[] helper(int[][] land, int i, int j, boolean[][] visited) {
        if (land[i][j] == 0 || visited[i][j]) return null;
        visited[i][j] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        int lx = land.length;
        int ly = land[0].length;
        int rx = 0;
        int ry = 0;
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            lx = Math.min(lx, temp[0]);
            ly = Math.min(ly, temp[1]);
            rx = Math.max(rx, temp[0]);
            ry = Math.max(ry, temp[1]);
            int x = temp[0];
            int y = temp[1];
            if (x - 1 >= 0) {
                visited[x - 1][y] = true;
                if (land[x - 1][y] == 1) {
                    queue.offer(new int[]{x - 1, y});
                }
            }
            if (x + 1 < land.length) {
                visited[x + 1][y] = true;
                if (land[x + 1][y] == 1) {
                    queue.offer(new int[]{x + 1, y});
                }
            }
            if (y - 1 >= 0) {
                visited[x][y - 1] = true;
                if (land[x][y - 1] == 1) {
                    queue.offer(new int[]{x, y - 1});
                }
            }
            if (y + 1 < land[0].length) {
                visited[x][y + 1] = true;
                if (land[x][y + 1] == 1) {
                    queue.offer(new int[]{x, y + 1});
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
            }
            if (rx - lx > 0 || ry - ly > 0) {
                return new int[]{lx, ly, rx, ry};
            }
            return null;
        }
    }

    
}