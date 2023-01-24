package com.codex;

import java.util.*;

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0, len = points.length;

        int[] pos = new int[26];
        for(int i = 0; i < len-1; i++) {
            int x = Math.abs(points[i+1][0] - points[i][0]);
            int y = Math.abs(points[i+1][1] - points[i][1]);
            res += Math.max(x, y);
        }
        return res;
    }
}