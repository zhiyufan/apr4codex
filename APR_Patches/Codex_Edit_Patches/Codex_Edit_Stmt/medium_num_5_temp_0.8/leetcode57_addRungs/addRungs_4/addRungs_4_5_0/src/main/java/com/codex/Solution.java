package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = 0;
        for (int i = 0; i < rungs.length; i++) {
            if (rungs[i] > currReach+dist) {
                rungsAdded++;
                currReach = rungs[i];
            }
        }
        return rungsAdded;
    }
}