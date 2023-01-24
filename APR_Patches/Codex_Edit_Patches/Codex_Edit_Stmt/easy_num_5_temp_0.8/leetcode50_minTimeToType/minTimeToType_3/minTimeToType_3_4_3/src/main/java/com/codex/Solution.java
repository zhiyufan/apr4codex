package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToVisitAllPoints(int[][] points) {
        

        int minTime = 0;

        for(int i = 0; i < points.length-1; i++) {
            int[] current = points[i];
            int[] next = points[i+1];
            minTime += Math.max(Math.abs(next[0] - current[0]), Math.abs(next[1] - current[1]));
        }

        return minTime;
    }

    
}