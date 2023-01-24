package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        int sum = mean * (n + rolls.length);
        for (int roll : rolls) {
            sum -= roll;
        }
        for (int i = 0; i < n; i++) {
            if (sum % n == 0) {
                int avg = sum / n;
                if (avg > 0 && avg <= 6) {
                    res[i] = avg;
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
    
    
    public static void main(String[] args) {
        int[] rolls = {1, 2, 3, 2, 1, 2};
        int mean = 2;
        int n = 2;
        System.out.println(Arrays.toString(missingRolls(rolls, mean, n)));
    }
    
}