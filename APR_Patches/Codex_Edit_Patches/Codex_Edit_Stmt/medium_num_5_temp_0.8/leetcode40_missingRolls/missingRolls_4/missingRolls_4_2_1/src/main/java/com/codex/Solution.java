package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum = 0;
        for (int x : rolls)
            sum += x;
        for (int x = 1; x <= 6; x++) {
            int temp = sum + x * n;
            if (temp % (rolls.length + n) == 0) {
                int k = temp / (rolls.length + n);
                if (k >= 1 && k <= 6) {
                    int[] res = new int[n];
                    Arrays.fill(res, k);
                    return res;
                }
            }
        }
    }


    
}