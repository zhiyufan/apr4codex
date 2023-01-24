package com.codex;

import java.util.*;

public class Solution {
 int m, n, k;
    int[] dr = new int[]{0, 1, 0, -1};
    int[] dc = new int[]{1, 0, -1, 0};
    boolean[][] visited;

    public int findCircleNum(int[][] M) {
        m = M.length;
        n = M[0].length;
        k = 0;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) continue;
                dfs(M, i, j);
            }
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) count++;
            right[i] = count;
        }
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] + right[i] > max) {
                ans.clear();
                ans.add(i);
                max = left[i] + right[i];
            } else if (left[i] + right[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }
    
}