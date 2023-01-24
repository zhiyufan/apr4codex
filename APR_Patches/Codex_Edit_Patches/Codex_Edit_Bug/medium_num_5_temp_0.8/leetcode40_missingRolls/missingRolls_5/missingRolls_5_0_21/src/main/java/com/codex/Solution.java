package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        for (int roll : rolls) {
            mean -= roll;
        }
        mean /= n - 1;
        for (int i = 0; i < n; i++) {
            res[i] = mean;
        }
        return res;
    }

    
}