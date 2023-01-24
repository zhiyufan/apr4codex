package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {

        if (n == 0)
            return new int[0];

        int[] ans = new int[n];
        int k = 0;
        int sum1 = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (mean * (n + rolls.length)) - sum1;
        for (int i = 0; i < ans.length; i++) {
            ans[k] = sum / n;
            sum -= sum / n;
            k++;
        }
        return ans;
    }
}