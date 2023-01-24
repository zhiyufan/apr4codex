package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsCount = 1;
        int maxReach = rungs[0];
        int current = 0;
        if (rungs.length == 1) {
            return 0;
        }
        for (int i = 1; i < rungs.length; i++) {
            if (current + dist < rungs[i]) {
                maxReach = rungs[i - 1];
                rungsCount++;
            }
            current = rungs[i];
        }
        return rungsCount;
    }

    
}