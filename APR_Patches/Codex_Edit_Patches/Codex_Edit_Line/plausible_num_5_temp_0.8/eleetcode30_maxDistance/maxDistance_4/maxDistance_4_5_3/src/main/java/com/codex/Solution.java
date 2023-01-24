package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colo) {
    
    int n = color.length;
    int[][] range = new int[3][2];
    for (int i = 0; i < 3; i++) {
        range[i] = new int[]{n, -1};
    }
    for (int i = 0; i < n; i++) {
        range[color[i]][0] = Math.min(range[color[i]][0], i);
        range[color[i]][1] = Math.max(range[color[i]][1], i);
    }
    int minDis = n - 1;
    for (int i = 0; i < 3; i++) {
        for (int j = i + 1; j < 3; j++) {
            minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
            minDis = Math.min(minDis, Math.abs(range[j][0] - range[i][1]));
        }
    }
    return minDis;
}
}