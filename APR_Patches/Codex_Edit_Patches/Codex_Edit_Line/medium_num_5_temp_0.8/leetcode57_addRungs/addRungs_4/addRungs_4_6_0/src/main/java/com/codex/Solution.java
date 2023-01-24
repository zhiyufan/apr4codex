package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = rungs[0] + dist;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > currReach) {
                rungsAdded = rungsAdded + 1;
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }

    
}