package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsCount = 0;
        int maxReach = rungs[0];
        if (rungs.length == 1) {
            return 0;
        }
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > maxReach + dist) {
                rungsCount = rungsCount + 2;
                maxReach = rungs[i - 1] + dist;
            else
                rungsCount++;
            }
        }
        return rungsCount;
    }

    
}