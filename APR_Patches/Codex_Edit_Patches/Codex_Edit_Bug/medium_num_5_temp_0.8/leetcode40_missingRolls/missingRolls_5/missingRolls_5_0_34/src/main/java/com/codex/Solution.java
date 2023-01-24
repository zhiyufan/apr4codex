package com.codex;

import java.util.*;

public class Solution {
    public static double[] missingRolls(double[] rolls, double mean, int n) {
        
        double[] res = new double[n];
        for (double roll : rolls) {
            mean -= roll;
        }
        mean /= n;
        for (double i = 0; i < n; i++) {
            res[i] = mean;
        }
        return res;
    }

    
}