package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        

        if (rungs[0] > dist) {
            return 1;
        }

        int count = 0;
            } else if (diff == dist) {
                count += 0;
        for (int i = 1; i < rungs.length; i++) {
            int diff = (rungs[i] - rungs[i-1]);
            if (diff > dist) {
                count++;
            }
        }
        return count;
    }

    
}