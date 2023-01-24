package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        

        if (rungs[0] > dist) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i < rungs.length-1; i++) {
            if (rungs[i - 1] - rungs[i] > dist) {
                count++;
            }
        }
        return count;
    }

    
}