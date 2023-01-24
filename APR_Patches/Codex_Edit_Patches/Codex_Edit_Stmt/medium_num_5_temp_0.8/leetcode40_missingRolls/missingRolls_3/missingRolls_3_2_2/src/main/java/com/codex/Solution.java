package com.codex;

import java.util.*;

public class Solution {
public static int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        int[] ans = new int[n];
        for (int i = 0; i < ans.length; i++) {
            sum += rolls[i];
        }
        sum = (mean * (n + rolls.length)) - sum;
        for (int i = 0; i < n; i++) {
            ans[i] = sum / n;
        }
        return ans;
    }
    }
}