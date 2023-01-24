package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsCount = 1;
        int maxReach = rungs[0];

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