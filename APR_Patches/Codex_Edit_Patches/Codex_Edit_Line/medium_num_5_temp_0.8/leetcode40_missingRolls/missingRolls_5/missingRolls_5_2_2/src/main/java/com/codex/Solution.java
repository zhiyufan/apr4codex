package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int n) {
        int[] res = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += rolls[i];
        }
        for (int i = 0; i < n; i++) {
            res[i] = (sum - rolls[i]) / (n - 1);
        }
        return res;
    }
}