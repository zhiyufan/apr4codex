package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] ans;
        int sum1 = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (mean * (n + rolls.length)) - sum1;
        if (sum % n == 0){
            ans = new int[n];
            for (int i = 0; i < ans.length; i++) {
                ans[i] = sum / n;
            }
            return ans;
        }
        else{
            int num = sum % n;
            ans = new int[n - 1];
            for (int i = 0; i < ans.length; i++) {
                ans[i] = (sum - num) / (n - 1);
            }
            return ans;
        }
        return ans;
    }



    
}