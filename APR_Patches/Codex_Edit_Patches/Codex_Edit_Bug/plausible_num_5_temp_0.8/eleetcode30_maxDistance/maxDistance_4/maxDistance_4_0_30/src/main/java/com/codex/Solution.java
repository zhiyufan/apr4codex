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
        int minDis = n - 1;
        for (int color = 0; color < 3; color++) {
            for (int compColor = 0; compColor < 3; compColor++) {
                if (compColor == color) {
                    continue;
                }
                minDis = Math.min(minDis, Math.abs(range[color][0] - range[compColor][1]));
                minDis = Math.min(minDis, Math.abs(range[compColor][0] - range[color][1]));
            }
        }
        return minDis;
    }
}