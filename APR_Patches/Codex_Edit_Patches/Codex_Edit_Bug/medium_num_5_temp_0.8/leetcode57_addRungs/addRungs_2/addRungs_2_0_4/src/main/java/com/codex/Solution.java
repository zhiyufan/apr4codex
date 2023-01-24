package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int add = rungs.length;
        int max = 0;
        for (int i = 0; i < rungs.length; i++) {
            if (rungs[i] > max) {
                max = rungs[i];
                add--;
            }
        }
        return add;
    }

    
}