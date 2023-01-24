package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];                                                    // Initialize answer array
        int sum = mean * (n + rolls.length);                                       // Expected sum of all rolls
        for (int roll : rolls) sum -= roll;                                       // Get expected sum - actual sum
        for (int i = 0; i < n; i++) {                                             // For each missing value
            if (sum % n == 0) {                                                   // If sum divisible by n
                int avg = sum / n;                                                // Avg of missing values
                if (avg > 0 && avg <= 6) {                                        // If missing value in range
                    res[i] = avg;                                                 // Add to answer
                    sum -= avg;                                                   // Update expected sum
                } else {                                                          // Missing value not in range
                    return new int[0];                                            // No answer
                }
            } else {
                return new int[0];
            }
        }
        return res;
    }
    
}