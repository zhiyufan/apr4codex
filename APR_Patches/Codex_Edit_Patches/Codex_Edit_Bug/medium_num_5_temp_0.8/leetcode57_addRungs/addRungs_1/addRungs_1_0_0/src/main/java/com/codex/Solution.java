package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int distance) {
        

        if (rungs[0] > distance) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[i-1] > distance) {
                count++;
            }
        }
        return count;
    }

    
}