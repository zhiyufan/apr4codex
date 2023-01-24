package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = rungs[0] + dist;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > currReach) {
                rungsAdded++;
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }

    public static int addRungs(int[] rungs, int dist) {
        if (rungs[0] > dist) return rungs.length;
        int rungsAdded = 0;
        int currReach = rungs[0] + dist;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > currReach) {
                rungsAdded++;
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }
    
}