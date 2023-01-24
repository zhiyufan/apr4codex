package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public String getPermutation(int n, int k) {
        int[] factorials = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i;
            visited[i] = false;
        }
        return dfs(n, k, n, visited, factorials);
    }
    private String dfs(int n, int k, int level, boolean[] visited, int[] factorials) {
        if (level == 0) {
            return "";
        }
        int unit = factorials[level - 1];
        int index = (k - 1) / unit;
        int count = 0;
        int i;
        for (i = 1; i <= n; i++) {
            if (visited[i] == false) {
                count++;
            }
            if (count > index) {//倒数第几个
                visited[i] = true;
                break;
            }
        }
        return i + dfs(n, k - index * unit, level - 1, visited, factorials);
    }
}
}