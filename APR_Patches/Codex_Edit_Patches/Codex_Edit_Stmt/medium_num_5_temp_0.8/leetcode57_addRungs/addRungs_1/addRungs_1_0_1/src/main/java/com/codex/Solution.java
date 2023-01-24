package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        

        if (rungs[0] > dist) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[i-1] > dist) {
                count=count+1;
            }
        }
        return count;
    }

    
}