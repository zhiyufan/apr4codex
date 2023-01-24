package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = 0;
        for (int i = 0; i < rungs.length; i++) {
            if (rungs[i] > currReach) {
                rungsAdded++;
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }

    
}