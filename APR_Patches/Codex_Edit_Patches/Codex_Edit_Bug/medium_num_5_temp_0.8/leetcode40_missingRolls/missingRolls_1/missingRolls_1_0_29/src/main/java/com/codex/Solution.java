package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] missingRolls(int[] rolls, int n, int mean) {
        if (mean * (n + rolls.length) % n != 0) {
            return new int[0];
        }
        int[] res = new int[n];        
        int sum = mean * (n + rolls.length) / n;
        for (int i = 0; i < n; i++) {
            if (sum > 0 && sum <= 6) {
                res[i] = sum;
                sum = mean * 2 - sum;
            } else {
                return new int[0];
            }
        }
        return res;
    }
    
}
}