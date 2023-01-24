package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {

        int[] ans = new int[n];
        int sum = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum += rolls[i];
        }
        int tot = (mean * (n + rolls.length)) - sum;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = tot / n;
        }
        return ans;
    }
}