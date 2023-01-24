package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        int sum = mean * (n + rolls.length), cnt = n;
        for (int roll : rolls) {
            sum -= roll;
            cnt--;
        }
        for (int i = 0; i < n; i++) {
            if (sum % cnt == 0) {
                int avg = sum / cnt;
                if (avg > 0 && avg <= 6) {
                    res[i] = avg;
                    sum -= avg;
                    cnt--;
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