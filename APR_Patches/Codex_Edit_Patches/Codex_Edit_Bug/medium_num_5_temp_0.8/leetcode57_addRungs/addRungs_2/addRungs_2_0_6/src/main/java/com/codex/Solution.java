package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int add = 0;
        int current = rungs[0];
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - current > dist) {
                add++;
                current = current + dist;
            } else if (rungs[i] - current < dist) {
                current = rungs[i];
            }
        }
        return add;
    }

    
}