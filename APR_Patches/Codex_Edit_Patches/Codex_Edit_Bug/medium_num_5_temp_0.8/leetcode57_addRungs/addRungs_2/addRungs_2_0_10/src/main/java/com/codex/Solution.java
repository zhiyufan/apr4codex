package com.codex;

import java.util.*;

public class Solution {
    /**
     * Returns the number of additional rungs needed to climb up the ladder
     * @param rungs
     * @param max
     * @return
     */
    public static int addRungs(int[] rungs, int max) {
        int add = 0;
        for (int i = 0; i < rungs.length - 1; i++) {
            if (rungs[i] - rungs[i + 1] > max) {
                int cut = rungs[i] - (rungs[i + 1] + max);
                add += (cut / max + (cut % max == 0 ? 0 : 1));
                rungs[i] = rungs[i + 1] + max;
            }
        }
        return add;
    }

    
}