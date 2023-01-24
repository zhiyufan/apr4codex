package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int expected, int n) {
        
        int sum = expected * (rolls.length + n);
        for (int x : rolls) sum -= x;
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