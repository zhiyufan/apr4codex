package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findWinners(int[][] matches) {
        

        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int[] match : matches) {
            hashMap.put(match[0], hashMap.getOrDefault(match[0], 0) + 1);
            hashMap.put(match[1], hashMap.getOrDefault(match[1], 0) + 1);
        }

        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) == 0) {
                list0.add(key);
            }
            else if (hashMap.get(key) == 1) {
                list1.add(key);
            }
        }
        Collections.sort(list0);
        Collections.sort(list1);
        res.add(list0);
        res.add(list1);
        return res;
    }


    public int findIslands(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    dfs(matrix, i, j, m, n);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int[][] matrix, int row, int col, int m, int n) {
        matrix[row][col] = 0;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int x = row + dx[i];
            int y = col + dy[i];
            if (x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] != 1) {
                continue;
            }
            dfs(matrix, x, y, m, n);
        }
    }
}