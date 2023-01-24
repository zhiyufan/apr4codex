package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        
        int sum = 0;
        for (int x : rolls) sum += x;
        sum = mean * (rolls.length + n) - sum;
        if (sum % n != 0) return new int[]{};
        else {
            int avg = sum / n;
            if (avg < 1 || avg > 6) return new int[]{};
            else {
                int[] res = new int[n];
                Arrays.fill(res, avg);
                return res;
            }
        }
    }

    
}