package com.codex;

import java.util.*;

public class Solution {
public int addRungs(int[] rungs, int dist) {
    int rungsAdded = 0;
    int currReach = rungs[0] + dist;
    for (int i = 1; i < rungs.length; i++) {
        if (rungs[i] > currReach) {
            if (i + 1 < rungs.length && rungs[i + 1] > currReach) {
                rungsAdded += 2;
                currReach = rungs[i + 1] + dist;
                i++;
            } else {
                rungsAdded++;
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }

    
}