package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum = mean * (rolls.length + n);
        for (int i = 0; i < rolls.length; i++) sum -= rolls[i];
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