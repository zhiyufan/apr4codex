package com.codex;

import java.util.*;

public class Solution {
public int maxDistance(int[] data) {
        int n = data.length;
        int min = Integer.MAX_VALUE;
        int[][] range = new int[][]{{n, -1}, {n, -1}, {n, -1}};
        for(int i=0;i<n;i++){
            int color = data[i];
            range[color][0] = Math.min(range[color][0], i);
            range[color][1] = Math.max(range[color][1], i);
        }
        for (int i = 0; i < n; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
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