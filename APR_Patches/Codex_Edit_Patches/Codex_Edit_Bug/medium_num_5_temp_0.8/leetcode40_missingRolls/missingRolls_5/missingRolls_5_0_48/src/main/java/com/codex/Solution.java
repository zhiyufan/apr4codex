package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        for (int roll : rolls) {
            mean -= roll;
        }
        for (int i = 0; i < n / 2; i++) {
            res[i] = mean - 1;
            res[res.length - i - 1] = mean + 1;
        }
        if (n % 2 != 0) res[n / 2] = mean;
        return res;
    }

    
}