package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int mean = 0;
        int[] ans = new int[n];
        int sum1 = 0;
        int finalI = rolls.length;
        for (int i = 0; i < finalI; i++) {
            sum1 = sum1 + rolls[i];
        }
        int sum = (mean * (n + rolls.length)) - sum1;
        int finalI = ans.length;
        for (int i = 0; i < finalI; i++) {
            ans[i] = sum / n;
        }
        return ans;
    }

    
}