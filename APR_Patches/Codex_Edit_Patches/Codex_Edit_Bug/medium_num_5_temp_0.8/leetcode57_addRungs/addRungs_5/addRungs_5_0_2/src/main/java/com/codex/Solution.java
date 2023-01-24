package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int count = 0;
        int max = 0;
        for (int i = 0; i < rungs.length - 1; i++) {
            if (rungs[i] > max) {
                if (rungs[i + 1] - max > dist) {
                    count++;
                    max = max + dist;
                } else {
                    max = rungs[i];
                }
            }
        }

        return count;
    }

    
}