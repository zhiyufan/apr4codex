package com.codex;

import java.util.*;

public class Solution {
    public static double[] missingRolls(int[] rolls, int mean, int n) {
        
        double[] res = new double[n];
        for (int roll : rolls) {
            mean -= roll;
        }
        mean /= n;
        for (int i = 0; i < n; i++) {
            res[i] = (double) mean;
        }
        return res;
    }

    
}