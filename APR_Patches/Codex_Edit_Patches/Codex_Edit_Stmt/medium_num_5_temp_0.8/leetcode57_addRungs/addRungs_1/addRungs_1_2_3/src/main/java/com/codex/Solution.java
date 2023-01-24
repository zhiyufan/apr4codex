package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        

        if (rungs[0] > dist) {
        int temp = 0;
            return 1;
        }

                temp = i;
        int count = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[temp] > dist) {
                count++;
            }
        }
        return count;
    }

    
}