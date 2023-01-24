package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsCount = 1;
        int maxReach = rungs[0] + dist;
        for (int i = 0; i < rungs.length; i++) {
            if (rungs[i] > maxReach) {
                rungsCount++;
                maxReach = rungs[i] + dist;
            }
        }
        return rungsCount;
    }

    
}