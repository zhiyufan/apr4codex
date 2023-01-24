package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors, int m) {
        
        int len = colors.length;
        int[][] range = new int[m][2];
        for (int i = 0; i < m; i++) {
            range[i] = new int[]{len, -1};
        }
        for (int i = 0; i < len; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
        }
        int minDis = len - 1;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
                minDis = Math.min(minDis, Math.abs(range[j][0] - range[i][1]));
            }
        }
        return minDis;
    }
}