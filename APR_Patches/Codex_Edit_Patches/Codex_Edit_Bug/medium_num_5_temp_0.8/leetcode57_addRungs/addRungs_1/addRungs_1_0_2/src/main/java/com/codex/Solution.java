package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
       
       for (int i = 0; i < rungs.length -1; i++) {
            if (rungs[i] > dist) {
                return 0;
            }
        }

        if (rungs[0] > dist) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[i - 1] > dist) {
                while (rungs[i] - rungs[i - 1] > dist) {
                    count++;
                    dist = dist * 2;
                }
            }
        }
        return count;
    }

    
}