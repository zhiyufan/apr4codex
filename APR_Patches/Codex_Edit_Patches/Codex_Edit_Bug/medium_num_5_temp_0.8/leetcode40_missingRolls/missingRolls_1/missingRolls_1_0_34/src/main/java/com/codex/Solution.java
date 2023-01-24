package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {

        int[] res = new int[n];
        long sum = mean * (n + rolls.length);
        for (int roll : rolls) {
            sum -= roll;
        }

        if (sum % n != 0) return new int[0];
        int avg = sum / n;

        if (avg <= 0 || avg > 6) return new int[0];

        for (int i = 0; i < n; i++) {
            res[i] = avg;
            sum -= avg;
        }
        return res;
    }
    
}