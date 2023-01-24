package com.codex;

import java.util.*;

public class Solution {
    static double maxDistance(int[] colors) {
        // System.out.println(Arrays.toString(colors));
        int n = colors.length;
        int[][] range = new int[3][2];
        for (int i = 0; i < 3; i++) {
            range[i] = new int[]{n, -1};
        }
        for (int i = 0; i < n; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
        }
        double minDis = n - 1;
        for (int i = 0; i < 3; i++) {
            // System.out.println(Arrays.deepToString(range));
            for (int j = i + 1; j < 3; j++) {
                minDis = Math.min(minDis, (range[i][0] - range[j][1] + 0.0) / 2);
                minDis = Math.min(minDis, (range[j][0] - range[i][1] + 0.0) / 2);
            }
        }
        // System.out.println(Arrays.deepToString(range));
        // System.out.println(minDis);
        return minDis;
    }
}