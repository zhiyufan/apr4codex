package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int average, int n) {
        
        int[] res = new int[n];
        for (int roll : rolls) {
            average -= roll;
        }
        mean /= n;
        for (int i = 0; i < n; i++) {
            res[i] = average;
        }
        return res;
    }

    
}