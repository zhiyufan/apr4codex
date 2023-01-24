package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] ans = new int[n];
        int sum1 = 0;
	int j = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
		j++;
        }
        int sum = (mean * (n + j)) - sum1;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum / n;
        }
        return ans;
    }

    
}