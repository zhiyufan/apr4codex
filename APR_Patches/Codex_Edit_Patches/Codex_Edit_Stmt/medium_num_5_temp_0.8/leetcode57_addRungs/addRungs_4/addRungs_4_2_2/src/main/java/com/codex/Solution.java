package com.codex;

import java.util.*;

public class Solution {
    /**
     * Compute the minimum number of rungs to add to a ladder 
     * so that the frog can always jump from one rung to the next.
     * 
     * @param rungs int[] the original rungs of the ladder
     * @param dist  int   the maximum distance the frog can jump
     * @return int the minimum number of additional rungs needed
     */
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = rungs[0] + dist;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > currReach) {
                rungsAdded++; // <--- Fix this line
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }

    
}