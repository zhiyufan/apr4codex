package com.codex;

import java.util.*;

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {

        int[] pos = new int[26];
        int res = 0, curX = points[0][0], curY = points[0][1];
        for (int[] point: points) {
            int x = point[0], y = point[1];
            res += Math.max(Math.abs(x - curX), Math.abs(y - curY));
            curX = x;
            curY = y;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));
            cur = pos[ch - 'a'];
        }
        return res;
    }
}