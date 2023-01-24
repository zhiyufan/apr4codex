package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int add = 0;
        i = 1;
        while(i < rungs.length) {
            if (rungs[i] - rungs[i - 1] > dist) {
                add++;
                rungs[i] = rungs[i - 1] + dist;
            } else {
                i++;
            }
        }
        return add;
    }

    
}