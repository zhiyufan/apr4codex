package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] ans = new int[n];
        int sum = (mean * (n + rolls.length)) - Arrays.stream(rolls).sum();
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum / n;
        }
        return ans;
    }
}