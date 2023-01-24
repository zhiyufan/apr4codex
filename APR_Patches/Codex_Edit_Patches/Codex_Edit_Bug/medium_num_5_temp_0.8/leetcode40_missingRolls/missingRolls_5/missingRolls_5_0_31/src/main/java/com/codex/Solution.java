package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int res[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int roll : rolls) {
            mean -= roll;
            if (roll < min)
                min = roll;
            if (roll > max)
                max = roll;
        }
        mean /= n;
        for (int i = 0; i < n; i++) {
            if (i != index)
                res[i] = mean;
            else
                res[i] = max - min;
        }
        return res;
    }

    
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        for (int roll : rolls) {
            mean -= roll;
        }
        mean /= n;
        for (int i = 0; i < n; i++) {
            res[i] = mean;
        }
        return res;
    }
}