package com.codex;

import java.util.*;

public class Solution {
// Definition of the rungs class
// E1: rungsCount is 0

    public static int addRungs(int[] rungs, int dist) {
        
        int rungsCount = 1;
        int maxReach = rungs[0];
        if (rungs.length == 1) {
            return 0;
        }
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > maxReach + dist) {
                rungsCount++;
                maxReach = rungs[i - 1] + dist;
            }
        }
        return rungsCount;
    }

    
}