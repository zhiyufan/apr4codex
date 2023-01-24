package com.codex;

import java.util.*;

public class Solution {
public static int addRungs(int[] rungs, int dist) {
        int count = 0;
        for (int i = 1; i < rungs.length; i++) {

        if (rungs[rungs.length - 1] < dist) {
            count++;
        }

            if (rungs[i] - rungs[i-1] > dist) {
                count++;
            }
        }
        return count;
    }

    
}