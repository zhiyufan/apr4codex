package com.codex;

import java.util.*;

public class Solution {
public static int[] missingRolls(int[] rolls, int mean, int n) {
    int[] res = new int[n];
    int sum = mean * (n + rolls.length);
    for (int roll : rolls) {
        sum -= roll;
    }
    int missingCount = n;
    for (int i = 0; i < n; i++) {
        if (sum % missingCount == 0) {
            int avg = sum / missingCount;
            if (avg > 0 && avg <= 6) {
                res[i] = avg;
                sum -= avg;
                missingCount--;
                if (missingCount == 0) {
                    return res;
                } else {
                    i++;
                }
            } else {
                return res;
            }
        } else {
            return res;
        }
        return res;
    }
    
}