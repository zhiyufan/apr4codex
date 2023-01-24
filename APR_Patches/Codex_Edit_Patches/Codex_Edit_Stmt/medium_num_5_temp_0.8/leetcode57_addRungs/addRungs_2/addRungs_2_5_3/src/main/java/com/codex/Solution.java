package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int add = 0;
        for (int i = 1; i < rungs.length; ) {
            if (rungs[i] - rungs[i - 1] > dist) {
                add++;
                i += Math.max(dist - rungs[i] - 1, 0);
            } else {
                i++;
            }
        }
        return add;
    }

    
}