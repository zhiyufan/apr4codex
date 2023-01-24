package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        //int a = addRungs(0, rungs, dist);
        //int b = addRungs(1, rungs, dist);
        //int c = addRungs(2, rungs, dist);
        //int m = min(a, b, c);
        Arrays.sort(rungs);
        int add = 0;
        for (int i = 1; i < rungs.length; ) {
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