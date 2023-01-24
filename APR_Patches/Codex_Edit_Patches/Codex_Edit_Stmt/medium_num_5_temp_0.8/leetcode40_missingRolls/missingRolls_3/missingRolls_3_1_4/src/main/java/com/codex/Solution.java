package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] ans = new int[n];
        int sum1 = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (mean * (n + rolls.length)) - sum1;
        int count = 0;
        for (int i = 0; i < ans.length; i++) {
            if (sum / n > mean) {
                ans[i] = sum / n;
                sum -= ans[i];
                count++;
            }
        }
        while (count < n) {
            ans[count - n]++;
            count++;
        }
        return ans;
    }

    
}