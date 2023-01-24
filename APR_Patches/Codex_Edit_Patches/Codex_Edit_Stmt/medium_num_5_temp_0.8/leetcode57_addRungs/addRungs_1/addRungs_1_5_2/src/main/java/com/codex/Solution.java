package com.codex;

import java.util.*;

public class Solution {
private static int a;

    public static int addRungs(int[] rungs, int dist) {
        

        a = 1;
        if (rungs[a] > dist) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[i-1] > dist) {
                count++;
            }
        }
        return count;
    }

    
}