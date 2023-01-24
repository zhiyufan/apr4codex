package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int count = 0;
        int max = 0;
        for (int i = 0; i < rungs.length; i++) {
            if (rungs[i] > max) {
                if (rungs[i] - max > dist) {
                    count++;
                    max = max + dist - 1;
                } else if (rungs[i] - max <= dist) {
                    max = rungs[i];
                }
            }
        }

        return count;
    }

    
}