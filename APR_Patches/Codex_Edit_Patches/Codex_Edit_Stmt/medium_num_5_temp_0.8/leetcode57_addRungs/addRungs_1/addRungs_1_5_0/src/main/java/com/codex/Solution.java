package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        

        int count = 0;
        }
        if (rungs[0] > dist) {
            return count + 1;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[i-1] > dist) {
                count++;
            }
        }
        return count;
    }

    
}