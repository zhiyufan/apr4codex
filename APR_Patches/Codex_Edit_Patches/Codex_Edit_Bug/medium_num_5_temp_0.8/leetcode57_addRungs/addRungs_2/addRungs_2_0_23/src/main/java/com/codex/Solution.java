package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        int add = 0;        
        for (int i = 1; i < rungs.length; i++) {
            
            if(rungs[i] - rungs[i-1] <= dist)
                continue;
            while (rungs[i] - rungs[i-1] > dist) {
                add++;
                rungs[i] = rungs[i-1] + dist;
            }
        }
        return add;
    }
   
}