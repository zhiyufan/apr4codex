package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        int averageSum = mean * (n + rolls.length);
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            int avg = averageSum / (n - i);
            if (avg > 0 && avg <= 6) {
                res[i] = avg;
                totalSum += avg;
                averageSum += avg;
            } else {
                return new int[0];
            }
        }
        if (totalSum != mean) {
            return new int[0];
        }
        return res;
    }
    
}