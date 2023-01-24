package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int n) {
        int mean = 0;
        for (int roll : rolls) {
            mean += roll;
        }
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