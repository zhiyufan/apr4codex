package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];

        // The mean of a list is (sum of all elements / length of list)
        for (int roll : rolls) {
            mean -= roll;
        }
        mean = Math.round((float)mean / (float)n);
        for (int i = 0; i < n; i++) {
            res[i] = mean;
        }
        return res;
    }

    
}