package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        int sum = mean * (n + rolls.length);
        for (int roll : rolls) {
            sum -= roll;
        }
        for (int i = 1; i <= n; i++) {
            if (sum % i == 0) {
                int avg = sum / i;
                if (avg > 0 && avg <= 6) {
                    res[i - 1] = avg;
                    sum -= avg;
                } else {
                    return new int[0];
                }
            } else {
                return new int[0];
            }
        }
        return res;
    }
    
}