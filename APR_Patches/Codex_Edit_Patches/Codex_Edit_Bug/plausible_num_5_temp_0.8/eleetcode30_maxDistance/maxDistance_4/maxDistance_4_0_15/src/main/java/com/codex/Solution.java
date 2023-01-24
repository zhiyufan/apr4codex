package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public int maxDistance(int[] colors) {
        
        int n = colors.length;
        int[][] range = new int[3][2];
        for (int i = 0; i < 3; i++) {
            range[i] = new int[]{n, 0};
        }
        for (int i = 0; i < n; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
        }
        int minDis = n - 1;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                minDis = Math.min(minDis, range[j][1] - range[i][0]);
                minDis = Math.min(minDis, range[i][1] - range[j][0]);
            }
        }
        return minDis;
    }
}
}