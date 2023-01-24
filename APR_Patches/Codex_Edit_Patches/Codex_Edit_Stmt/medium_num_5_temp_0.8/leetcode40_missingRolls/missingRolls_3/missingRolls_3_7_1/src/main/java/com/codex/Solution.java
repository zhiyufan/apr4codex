package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[rolls.length + n];
        int sum1 = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (mean * (n + rolls.length)) - sum1;
        for (int i = rolls.length; i < ans.length; i++) {
            ans[i] = Math.round(sum / n);
        }
        System.arraycopy(rolls, 0, ans, 0, rolls.length);
        return ans;
    }
}