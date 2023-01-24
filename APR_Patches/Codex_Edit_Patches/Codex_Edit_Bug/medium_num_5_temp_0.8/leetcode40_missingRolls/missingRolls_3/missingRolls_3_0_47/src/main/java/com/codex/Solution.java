package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] ans = new int[n];
        int sum1 = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (mean * n) - sum1;
        int k = 0;
        for (int i = rolls.length; i < rolls.length + n; i++) {
            ans[k] = sum / n;
            k++;
        }
        return ans;
    }

    
}