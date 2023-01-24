package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int mean = Arrays.stream(rolls).sum() / rolls.length;
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