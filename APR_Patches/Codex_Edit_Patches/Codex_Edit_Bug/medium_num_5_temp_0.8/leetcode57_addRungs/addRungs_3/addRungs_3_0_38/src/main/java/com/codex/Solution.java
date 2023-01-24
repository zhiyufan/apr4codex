package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int k) {
        
        int rungsCount = 1;
        int maxReach = rungs[0];
        if (rungs.length == 1) {
            return 0;
        }
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > maxReach + k) {
                rungsCount++;
                maxReach = rungs[i - 1] + dist;
            }
        }
        return rungsCount;
    }

    
}