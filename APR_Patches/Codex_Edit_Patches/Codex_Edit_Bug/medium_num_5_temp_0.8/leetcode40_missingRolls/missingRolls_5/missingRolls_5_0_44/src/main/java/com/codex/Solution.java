package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n - 1];
        for (int roll : rolls) {
            mean -= roll;
        }
        mean /= n;
        if (mean < 0 || mean > 6) {
            return null;
        }
        for (int i = 0; i < n - 1; i++) {
            res[i] = mean;
        }
        return res;
    }

    
}