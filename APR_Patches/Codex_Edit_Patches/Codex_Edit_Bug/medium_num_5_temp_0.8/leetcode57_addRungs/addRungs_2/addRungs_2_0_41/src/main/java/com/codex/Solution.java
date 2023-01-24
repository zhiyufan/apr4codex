package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {

        int add = 0;
        int curDist = dist;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[i - 1] > curDist) {
                add++;
                curDist = dist + rungs[i - 1];
                rungs[i] = rungs[i - 1] + curDist;
            }
        }
        return add;
    }

    
}