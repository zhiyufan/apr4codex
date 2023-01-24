package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int n = colors.length;
        int[][] range = new int[3][2];
        for (int i = 0; i < 3; i++) {
            range[i] = new int[]{n, -1};
        }
        for (int i = 0; i < n; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
        }
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (range[i][0] != n && range[j][0] != n) {
                    minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][0]));
                    minDis = Math.min(minDis, Math.abs(range[i][1] - range[j][1]));
                    minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
                    minDis = Math.min(minDis, Math.abs(range[i][1] - range[j][0]));
                }
            }
        }
        return minDis;
    }
}