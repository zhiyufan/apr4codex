package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        if (n <= 0) return new int[]{};
        int sum = mean * (rolls.length + n);
        for (int x : rolls) sum -= x;
        if (sum % n != 0 || sum / n < 1 || sum / n > 6) return new int[]{};
        else { 
            int[] res = new int[n];
            Arrays.fill(res, avg);
            return res; 
        }
    }

    
}