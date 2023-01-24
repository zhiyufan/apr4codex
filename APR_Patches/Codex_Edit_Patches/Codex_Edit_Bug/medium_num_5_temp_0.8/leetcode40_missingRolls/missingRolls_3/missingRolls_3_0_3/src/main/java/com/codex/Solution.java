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
        if (sum % n == 0) {
            int x = sum / n;
            for (int i = 0; i < ans.length; i++) {
                ans[i] = x;
            }
            return ans;
        } else {
            int x = sum / n;
            int d = sum % n;
            for (int i = 0; i < ans.length; i++) {
                if (i < d) {
                    ans[i] = x + 1;
                } else {
                    ans[i] = x;
                }
            }
            return ans;
        }
    }
}