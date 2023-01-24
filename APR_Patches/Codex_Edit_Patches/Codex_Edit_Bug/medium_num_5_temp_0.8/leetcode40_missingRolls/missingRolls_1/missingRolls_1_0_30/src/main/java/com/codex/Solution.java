package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        int sum = mean * (n + rolls.length);
        for (int roll : rolls) {
            sum -= roll;
        }
        if (sum % n == 0) {
            int avg = sum / n;
            if (avg > 0 && avg <= 6) {
                for (int i = 0; i < n; i++) {
                    res[i] = avg;
                }
                return res;
            } else {
                return new int[0];
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                res[i] = 6;
            }
            sum -= 6 * (n - 1);
            if (sum <= 6 && sum > 0) {
                res[n - 1] = sum;
                return res;
            } else {
                    return new int[0];
                }
            }
            return res;
        }
    }
    
}