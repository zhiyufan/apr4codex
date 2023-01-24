package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        int n = colors.length;
        int k = 3;
        int[][] range = new int[k][2];
        for (int i = 0; i < k; i++) {
            range[i] = new int[]{n, -1};
        }
        for (int i = 0; i < n; i++) {
            int color = colors[i];
            range[color][0] = Math.min(range[color][0], i);
            range[color][1] = Math.max(range[color][1], i);
        }
        int minDis = n - 1;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
                minDis = Math.min(minDis, Math.abs(range[j][0] - range[i][1]));
            }
        }
        return minDis;
    }
}