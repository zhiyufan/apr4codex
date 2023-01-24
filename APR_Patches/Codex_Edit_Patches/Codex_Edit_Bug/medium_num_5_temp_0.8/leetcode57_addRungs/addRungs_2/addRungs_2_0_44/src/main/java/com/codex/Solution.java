package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int add = 0;
        for (int i = 1; i < rungs.length; ++i) {
            add += (rungs[i] - rungs[i - 1] + dist - 1) / dist - 1;
        }
        return add;
    }

    
}